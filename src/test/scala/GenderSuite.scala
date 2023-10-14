//import com.sambeth.oclm.models.gender.Gender
//import com.sambeth.oclm.models.gender.Gender.{Female, Male}
//import com.sambeth.oclm.models.gender.GenderPairing.given
//
//import org.scalatest.matchers.should
//import org.scalatest.prop.{TableDrivenPropertyChecks, TableFor2}
//import org.scalatest.propspec.AnyPropSpec
//
//class GenderSuite extends AnyPropSpec with TableDrivenPropertyChecks with should.Matchers {
//
//  val genderPairs: TableFor2[Gender, Gender] = Table(
//    ("gender1", "gender2"),
//    (Male, Male),
//    (Female, Female)
//  )
//
//  forAll (genderPairs) { (gender1: Gender, gender2: Gender) =>
//    gender1.pair(gender2) should be true
//  }
//}
