import com.sambeth.oclm.models.gender.Gender
import com.sambeth.oclm.models.gender.Gender.*
import com.sambeth.oclm.models.appointedman.AppointedMan
import com.sambeth.oclm.models.member.MemberAssignment.InitialCall
import com.sambeth.oclm.models.member.{Member, MemberAssignment}


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

  println(maleStudent.assign("InitialCall", Some(maleStudent2)))

//  println(MemberAssignment.assign())
//  println(InitialCall[Male.type].assign(maleStudent, maleStudent2))
//  MemberAssignment(_, maleStudent, femaleStudent2)
//  MemberAssignment("InitialCall", femaleStudent, femaleStudent2)
//  MemberAssignment("InitialCall", femaleStudent, maleStudent2)


//  println()
//  println(maleStudent.pair(maleStudent2))
//  println(femaleStudent.pair(femaleStudent2))
}
