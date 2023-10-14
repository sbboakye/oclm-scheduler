import com.sambeth.oclm.models.member.Member
import com.sambeth.oclm.models.gender.Gender.*
import com.sambeth.oclm.models.gender.Gender

import org.scalatest.matchers.should
import org.scalatest.prop.{TableDrivenPropertyChecks, TableFor2}
import org.scalatest.propspec.AnyPropSpec

class MemberSuite extends AnyPropSpec with TableDrivenPropertyChecks with should.Matchers {

  val maleMembers: TableFor2[Member[Male.type], Member[Male.type]] = Table(
    ("member1", "member2"),
    (Member[Male.type]("Samuel"), Member[Male.type]("Tony")),
  )

  val femaleMembers: TableFor2[Member[Female.type], Member[Female.type]] = Table(
    ("member1", "member2"),
    (Member[Female.type]("Phyll"), Member[Female.type]("Jane"))
  )

  val members: TableFor2[Member[Male.type], Member[Female.type]] = Table(
    ("member1", "member2"),
    (Member[Male.type]("Samuel"), Member[Female.type]("Phyll")),
  )

  forAll (maleMembers) { (member1, member2) =>
    member1 pair member2 shouldBe true
  }

  forAll(femaleMembers) { (member1, member2) =>
    member1 pair member2 shouldBe true
  }

  forAll(members) { (member1, member2) =>
    "member1 pair member2" shouldNot compile
  }

  forAll(members) { (member1, member2) =>
    "member2 pair member1" shouldNot compile
  }

}
