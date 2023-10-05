import com.sambeth.oclm.models.{AppointedMan, Female, Gender, Male, Student}
import com.sambeth.oclm.utils.gender.GenderPairing
import com.sambeth.oclm.utils.gender.GenderPairing.given
import com.sambeth.oclm.utils.student.StudentGenderPairing
import com.sambeth.oclm.utils.student.StudentGenderPairing.given

object MainApp extends App {

  val elder = AppointedMan("Samuel Baafi Boakye", true)
  val ms = AppointedMan("Samuel Acquah", false)
  val maleStudent = Student("Tony Gyan", Male)
  val maleStudent2 = Student("Real Gyan", Male)
  val femaleStudent = Student("Casey Gyan", Female)
  val femaleStudent2 = Student("Esther Gyan", Female)
  println(elder)
  println(ms)
  println(maleStudent)
  println(femaleStudent)

  println(GenderPairing[Male].pair(Male, Male))
  println(GenderPairing[Female].pair(Female, Female))

  println()
  println(maleStudent.pair(maleStudent2))
  println(femaleStudent.pair(femaleStudent2))
  println(maleStudent.pair(femaleStudent2))
  println(femaleStudent.pair(maleStudent2))

  println(StudentGenderPairing[Student[Gender]].pair(maleStudent, maleStudent2))
  println(StudentGenderPairing[Student[Gender]].pair(femaleStudent, femaleStudent2))
  println(StudentGenderPairing[Student[Gender]].pair(femaleStudent, maleStudent2))
}
