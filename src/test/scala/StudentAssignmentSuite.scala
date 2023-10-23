import com.sambeth.oclm.models.gender.Gender
import com.sambeth.oclm.models.gender.Gender.{Female, Male}
import com.sambeth.oclm.models.student.Student
import org.scalatest.matchers.should
import org.scalatest.prop.{TableDrivenPropertyChecks, TableFor2}
import org.scalatest.propspec.AnyPropSpec

class StudentAssignmentSuite extends AnyPropSpec with TableDrivenPropertyChecks with should.Matchers {
  val maleStudents: TableFor2[Student[Male.type], Student[Male.type]] = Table(
    ("student1", "student2"),
    (Student[Male.type]("Samuel"), Student[Male.type]("Tony"))
  )

  val femaleStudents: TableFor2[Student[Female.type], Student[Female.type]] = Table(
    ("student1", "student2"),
    (Student[Female.type]("Phyll"), Student[Female.type]("Jane")),
  )

  val students = Table(
    ("student1", "student2"),
    (Student[Male.type]("Samuel"), Student[Female.type]("Phyll")),
    (Student[Female.type]("Phyll"), Student[Male.type]("Samuel"))
  )

  // start tests for male pairing
  property("two males paired for an initial call assignment should compile") {
    forAll(maleStudents) { (student1, student2) =>
      "student1 assignInitialCall student2" should compile
    }
  }

  property("two males paired for an return visit assignment should compile") {
    forAll(maleStudents) { (student1, student2) =>
      "student1 assignReturnVisit student2" should compile
    }
  }

  property("two males paired for an bible study assignment should compile") {
    forAll(maleStudents) { (student1, student2) =>
      "student1 assignBibleStudy student2" should compile
    }
  }
  // end tests for male pairing

  // start tests for only male assignments
  property("a male can be assigned bible reading assignment and it should compile") {
    forAll(maleStudents) { (student1, student2) =>
      "student1.assignBibleReading" should compile
    }
  }

  property("a male can be assigned five minutes talk assignment and it should compile") {
    forAll(maleStudents) { (student1, student2) =>
      "student1.assignFiveMinutesTalk" should compile
    }
  }
  // end test for only male assignments


  // start tests for female pairing
  property("two females paired for an initial call assignment should compile") {
    forAll(femaleStudents) { (student1, student2) =>
      "student1 assignInitialCall student2" should compile
    }
  }

  property("two females paired for an return visit assignment should compile") {
    forAll(femaleStudents) { (student1, student2) =>
      "student1 assignReturnVisit student2" should compile
    }
  }

  property("two females paired for an bible study assignment should compile") {
    forAll(femaleStudents) { (student1, student2) =>
      "student1 assignBibleStudy student2" should compile
    }
  }
  // end tests for female pairing


  // start tests for non-female assignments
  property("a female cannot be assigned bible reading assignment and it should not compile") {
    forAll(femaleStudents) { (student1, student2) =>
      "student1.assignBibleReading" shouldNot compile
    }
  }

  property("a female cannot be assigned five minutes talk assignment and it should not compile") {
    forAll(femaleStudents) { (student1, student2) =>
      "student1.assignFiveMinutesTalk" shouldNot compile
    }
  }
  // end tests for non-female assignments


  // start tests for wrongly paired assignments
  property("two student of opposite genders paired for an initial call assignment should not compile") {
    forAll(students) { (student1, student2) =>
      "student1 assignInitialCall student2" shouldNot compile
    }
  }

  property("two student of opposite genders paired for an return visit assignment should not compile") {
    forAll(students) { (student1, student2) =>
      "student1 assignReturnVisit student2" shouldNot compile
    }
  }

  property("two student of opposite genders paired for an bible study assignment should not compile") {
    forAll(students) { (student1, student2) =>
      "student1 assignBibleStudy student2" shouldNot compile
    }
  }
  // end tests for wrongly paired assignments
}
