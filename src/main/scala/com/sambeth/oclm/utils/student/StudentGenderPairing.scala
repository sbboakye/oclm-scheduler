package com.sambeth.oclm.utils.student

import com.sambeth.oclm.models.{Gender, Student}


trait StudentGenderPairing[S] {
  def pair(x: S, y: S): Boolean
}

object StudentGenderPairing {
  def apply[S](implicit sp: StudentGenderPairing[S]): StudentGenderPairing[S] = sp

  given studentGenderPairing: StudentGenderPairing[Student[Gender]] with
    def pair(x: Student[Gender], y: Student[Gender]): Boolean = x pair y
}
