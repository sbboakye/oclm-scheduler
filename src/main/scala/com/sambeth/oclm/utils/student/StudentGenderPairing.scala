package com.sambeth.oclm.utils.student

import com.sambeth.oclm.models.{Gender, Student}


trait StudentGenderPairing[S] {
  def pair(x: S, y: S): Boolean
}

object StudentGenderPairing {
  def apply[S](implicit sp: StudentGenderPairing[S]): StudentGenderPairing[S] = sp

  given studentGenderPairing[G <: Gender]: StudentGenderPairing[Student[G]] with
    def pair(x: Student[G], y: Student[G]): Boolean = x pair y
}
