import com.sambeth.oclm.models.{AppointedMan, Member}
import com.sambeth.oclm.models.Gender.*
import com.sambeth.oclm.utils.gender.GenderPairing
import com.sambeth.oclm.utils.gender.GenderPairing.given
import com.sambeth.oclm.utils.student.MemberGenderPairing
import com.sambeth.oclm.utils.student.MemberGenderPairing.given

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

  println(GenderPairing[Male.type].pair(Male, Male))
  println(GenderPairing[Female.type].pair(Female, Female))

  println()
  println(maleStudent.pair(maleStudent2))
  println(femaleStudent.pair(femaleStudent2))


  println(MemberGenderPairing[Member[Male.type]].pair(maleStudent, maleStudent2))
  println(MemberGenderPairing[Member[Female.type]].pair(femaleStudent, femaleStudent2))
}
