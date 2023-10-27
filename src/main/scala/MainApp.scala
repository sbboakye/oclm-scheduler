import cats.data.Kleisli
import com.sambeth.oclm.models.gender.Gender
import com.sambeth.oclm.models.gender.Gender.*
import com.sambeth.oclm.models.appointedman.AppointedMan
import com.sambeth.oclm.models.appointedman.AppointedManResponsibility.*
import com.sambeth.oclm.models.student.Student
import com.sambeth.oclm.models.workbook.WorkBook
import com.typesafe.config.{Config, ConfigFactory}


object MainApp extends App {

  case class OCLMConfig(config: Config)
  val oclmConfig: Config = ConfigFactory.load("oclm.conf")

  trait OCLM
  object OCLM {
    val fromOCLMConfig: Kleisli[List, OCLMConfig, WorkBook] = ???
  }

}
