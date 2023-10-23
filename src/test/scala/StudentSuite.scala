import com.sambeth.oclm.models.student.Student
import com.sambeth.oclm.models.gender.Gender.*
import com.sambeth.oclm.models.gender.Gender

import org.scalatest.matchers.should
import org.scalatest.prop.{TableDrivenPropertyChecks, TableFor2}
import org.scalatest.propspec.AnyPropSpec

class StudentSuite extends AnyPropSpec with TableDrivenPropertyChecks with should.Matchers {

  val maleStudents: TableFor2[Student[Male.type], Student[Male.type]] = Table(
    ("student1", "student2"),
    (Student[Male.type]("Samuel"), Student[Male.type]("Tony")),
  )

  val femaleStudents: TableFor2[Student[Female.type], Student[Female.type]] = Table(
    ("student1", "student2"),
    (Student[Female.type]("Phyll"), Student[Female.type]("Jane"))
  )

  val students: TableFor2[Student[Male.type], Student[Female.type]] = Table(
    ("student1", "student2"),
    (Student[Male.type]("Samuel"), Student[Female.type]("Phyll")),
  )

  property("two male students cam be paired") {
    forAll(maleStudents) { (student1, student2) =>
      student1 pair student2 shouldBe true
    }
  }

  property("two females students cam be paired") {
    forAll(femaleStudents) { (student1, student2) =>
      student1 pair student2 shouldBe true
    }
  }

  property("pairing male and female students should not compile") {
    forAll(students) { (student1, student2) =>
      "student1 pair student2" shouldNot compile
    }
  }


  property("pairing female and male students should not compile") {
    forAll(students) { (student1, student2) =>
      "student2 pair student1" shouldNot compile
    }
  }

}
