import com.sambeth.oclm.models.appointedman.AppointedMan
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class AppointedManSuite extends AnyFlatSpec with should.Matchers {

  "An appointed man with isElder true" should "be an elder" in {
    val elder = AppointedMan("John Doe", true)
    assert(elder.isInstanceOf[AppointedMan.Elder])
  }

  "An appointed man with isElder false" should "be a ministerial servant" in {
    val ms = AppointedMan("John Doe", false)
    assert(ms.isInstanceOf[AppointedMan.MinisterialServant])
  }

}
