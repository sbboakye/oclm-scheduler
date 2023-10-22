import com.sambeth.oclm.models.gender.Gender
import com.sambeth.oclm.models.gender.Gender.{Female, Male}
import com.sambeth.oclm.models.member.{Member, MemberAssignment}
import org.scalatest.matchers.should
import org.scalatest.prop.{TableDrivenPropertyChecks, TableFor2}
import org.scalatest.propspec.AnyPropSpec

class MemberAssignmentSuite extends AnyPropSpec with TableDrivenPropertyChecks with should.Matchers {
  val maleMembers = Table(
    ("member1", "member2"),
    (Member[Male.type]("Samuel"), Member[Male.type]("Tony"))
  )

  val femaleMembers = Table(
    ("member1", "member2"),
    (Member[Female.type]("Phyll"), Member[Female.type]("Jane")),
  )

  val assignmentType = "InitialCall"

  property("two males paired for an initial call assignment should compile") {
    forAll(maleMembers) { (member1, member2) =>
      """
      val assignmentType: String = InitialCall
      MemberAssignment(assignmentType, member1, member2)
      """ should compile
    }
  }

//  property("two females paired for an initial call assignment should compile") {
//    forAll(femaleMembers) { (member1, member2) =>
//      "MemberAssignment(InitialCall: String, member1, member2)" should compile
//    }
//  }

}
