import com.sambeth.oclm.models.appointedman.AppointedMan
import com.sambeth.oclm.models.appointedman.AppointedManResponsibility.{Elder, MinisterialServant}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class AppointedManAssignmentSuite extends AnyFlatSpec with should.Matchers {

  // starts elder tests
  "An appointed man who is an elder" should "be able to handle opening prayer assignment and it should compile" in {
    val elder = AppointedMan[Elder.type]("John Doe")
    "elder.assignOpeningPrayer" should compile
  }

  "An appointed man who is an elder" should "be able to handle ten minutes talk assignment and it should compile" in {
    val elder = AppointedMan[Elder.type]("John Doe")
    "elder.assignTenMinutesTalk" should compile
  }

  "An appointed man who is an elder" should "be able to handle spiritual gems assignment and it should compile" in {
    val elder = AppointedMan[Elder.type]("John Doe")
    "elder.assignSpiritualGems" should compile
  }

  "An appointed man who is an elder" should "be able to handle adhoc assignment and it should compile" in {
    val elder = AppointedMan[Elder.type]("John Doe")
    "elder.assignAdHoc" should compile
  }

  "An appointed man who is an elder" should "be able to handle closing  prayer assignment and it should compile" in {
    val elder = AppointedMan[Elder.type]("John Doe")
    "elder.assignClosingPrayer" should compile
  }

  "An appointed man who is an elder" should "be able to handle chairman assignment and it should compile" in {
    val elder = AppointedMan[Elder.type]("John Doe")
    "elder.assignChairman" should compile
  }

  "An appointed man who is an elder" should "not be able to handle congregation bible study assignment and it should compile" in {
    val elder = AppointedMan[Elder.type]("John Doe")
    "elder.assignCongregationBibleStudy" should compile
  }
  // ends elder tests


  // starts ms tests
  "An appointed man who is an ms" should "be able to handle opening prayer assignment and it should compile" in {
    val ms = AppointedMan[MinisterialServant.type]("John Doe")
    "ms.assignOpeningPrayer" should compile
  }

  "An appointed man who is an ms" should "be able to handle ten minutes talk assignment and it should compile" in {
    val ms = AppointedMan[MinisterialServant.type]("John Doe")
    "ms.assignTenMinutesTalk" should compile
  }

  "An appointed man who is an ms" should "be able to handle spiritual gems assignment and it should compile" in {
    val ms = AppointedMan[MinisterialServant.type]("John Doe")
    "ms.assignSpiritualGems" should compile
  }

  "An appointed man who is an ms" should "be able to handle adhoc assignment and it should compile" in {
    val ms = AppointedMan[MinisterialServant.type]("John Doe")
    "ms.assignAdHoc" should compile
  }

  "An appointed man who is an ms" should "be able to handle closing  prayer assignment and it should compile" in {
    val ms = AppointedMan[MinisterialServant.type]("John Doe")
    "ms.assignClosingPrayer" should compile
  }

  "An appointed man who is an ms" should "not be able to handle chairman assignment and it should not compile" in {
    val ms = AppointedMan[MinisterialServant.type]("John Doe")
    "ms.assignChairman" shouldNot compile
  }

  "An appointed man who is an ms" should "not be able to handle congregation bible study assignment and it should not compile" in {
    val ms = AppointedMan[MinisterialServant.type]("John Doe")
    "ms.assignCongregationBibleStudy" shouldNot compile
  }
  // ends elder tests

}
