package com.sambeth.oclm.utils.student

import com.sambeth.oclm.models.{Gender, Member}


trait MemberGenderPairing[S] {
  def pair(x: S, y: S): Boolean
}

object MemberGenderPairing {
  def apply[S](implicit sp: MemberGenderPairing[S]): MemberGenderPairing[S] = sp

  given memberGenderPairing[G <: Gender]: MemberGenderPairing[Member[G]] with
    def pair(x: Member[G], y: Member[G]): Boolean = x pair y
}
