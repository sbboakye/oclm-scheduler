package com.sambeth.oclm.utils

import cats.data.NonEmptyList
import com.sambeth.oclm.models.appointedman.AppointedMan
import com.sambeth.oclm.models.student.Student
import com.sambeth.oclm.models.gender.Gender.{Female, Male}
import com.sambeth.oclm.models.appointedman.AppointedManResponsibility.{Elder, MinisterialServant}


object Congregation {
  val maleStudents: List[Student[Male.type]] = List[Student[Male.type]](
    Student[Male.type]("Tony"),
    Student[Male.type]("Sam"),
    Student[Male.type]("Gyan"),
    Student[Male.type]("Beth"),
    Student[Male.type]("Masel"),
  )

  val femaleStudents: List[Student[Female.type]] = List[Student[Female.type]](
    Student[Female.type]("Phyll"),
    Student[Female.type]("Sweety"),
    Student[Female.type]("Mimi"),
    Student[Female.type]("Jane"),
    Student[Female.type]("Eunice"),
  )

  val elders: List[AppointedMan[Elder.type]] = List[AppointedMan[Elder.type]](
    AppointedMan[Elder.type]("Albert"),
    AppointedMan[Elder.type]("Noah"),
    AppointedMan[Elder.type]("Ted"),
    AppointedMan[Elder.type]("John"),
    AppointedMan[Elder.type]("Moe"),
  )

  val ministerialServants: List[AppointedMan[MinisterialServant.type]] = List[AppointedMan[MinisterialServant.type]](
    AppointedMan[MinisterialServant.type]("Ed"),
    AppointedMan[MinisterialServant.type]("Fred"),
    AppointedMan[MinisterialServant.type]("Doe"),
    AppointedMan[MinisterialServant.type]("Pat"),
    AppointedMan[MinisterialServant.type]("Dad"),
  )
}
