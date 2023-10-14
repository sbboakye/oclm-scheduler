import com.sambeth.oclm.models.gender.Gender
import com.sambeth.oclm.models.gender.Gender.*
import com.sambeth.oclm.models.appointedman.AppointedMan
import com.sambeth.oclm.models.member.Member


object MainApp extends App {

  val elder = AppointedMan("Samuel Baafi Boakye", true)
  val ms = AppointedMan("Samuel Acquah", false)
  val maleStudent = Member[Male.type]("Tony Gyan")
  val maleStudent2 = Member[Male.type]("Real Gyan")
  val femaleStudent = Member[Female.type]("Casey Gyan")
  val femaleStudent2 = Member[Female.type]("Esther Gyan")
  println(elder)
  println(ms)
  println(maleStudent)
  println(femaleStudent)

  println()
  println(maleStudent.pair(maleStudent2))
  println(femaleStudent.pair(femaleStudent2))
}
