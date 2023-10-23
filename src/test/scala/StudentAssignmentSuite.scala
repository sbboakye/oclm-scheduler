import com.sambeth.oclm.models.gender.Gender
import com.sambeth.oclm.models.gender.Gender.{Female, Male}
import com.sambeth.oclm.models.student.{Student, StudentAssignment}
import org.scalatest.matchers.should
import org.scalatest.prop.{TableDrivenPropertyChecks, TableFor2}
import org.scalatest.propspec.AnyPropSpec

class StudentAssignmentSuite extends AnyPropSpec with TableDrivenPropertyChecks with should.Matchers {
  val maleStudents = Table(
    ("member1", "member2"),
    (Student[Male.type]("Samuel"), Student[Male.type]("Tony"))
  )

  val femaleStudents = Table(
    ("member1", "member2"),
    (Student[Female.type]("Phyll"), Student[Female.type]("Jane")),
  )

  val assignmentType = "InitialCall"

  property("two males paired for an initial call assignment should compile") {
    forAll(maleStudents) { (member1, member2) =>
      """
      val assignmentType: String = InitialCall
      StudentAssignment(assignmentType, member1, member2)
      """ should compile
    }
  }

//  property("two females paired for an initial call assignment should compile") {
//    forAll(femaleStudents) { (member1, member2) =>
//      "StudentAssignment(InitialCall: String, member1, member2)" should compile
//    }
//  }

}
