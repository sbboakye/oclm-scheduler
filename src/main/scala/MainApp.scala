import com.sambeth.oclm.models.gender.Gender
import com.sambeth.oclm.models.gender.Gender.*
import com.sambeth.oclm.models.appointedman.AppointedMan
import com.sambeth.oclm.models.appointedman.AppointedManResponsibility.*

import com.sambeth.oclm.models.student.Student


object MainApp extends App {

  val elder = AppointedMan[Elder.type]("Samuel Baafi Boakye")
  val ms = AppointedMan[MinisterialServant.type]("Samuel Acquah")
  val maleStudent = Student[Male.type]("Tony Gyan")
  val maleStudent2 = Student[Male.type]("Real Gyan")
  val femaleStudent = Student[Female.type]("Casey Gyan")
  val femaleStudent2 = Student[Female.type]("Esther Gyan")
  println(elder)
  println(ms)
  println(maleStudent)
  println(femaleStudent)

//  println(maleStudent.assignBibleStudy(femaleStudent2))
  println(maleStudent.assignBibleStudy(maleStudent2))
  println(maleStudent.assignFiveMinutesTalk)
  println(maleStudent.assignFiveMinutesTalk)
//  println(elder.assign)
//  println(ms.assign)

//  println(MemberAssignment.assign())
//  println(InitialCall[Male.type].assign(maleStudent, maleStudent2))
//  MemberAssignment(_, maleStudent, femaleStudent2)
//  MemberAssignment("InitialCall", femaleStudent, femaleStudent2)
//  MemberAssignment("InitialCall", femaleStudent, maleStudent2)


//  println()
//  println(maleStudent.pair(maleStudent2))
//  println(femaleStudent.pair(femaleStudent2))
}
