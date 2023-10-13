package com.sambeth.oclm.models.gender

import com.sambeth.oclm.models.gender.Gender.*

trait GenderPairing[G] {
  def pair(x: G, y: G): Boolean
}

object GenderPairing {
  def apply[G](implicit gp: GenderPairing[G]): GenderPairing[G] = gp
  
  given malePairing: GenderPairing[Male.type] with
    def pair(x: Male.type, y: Male.type): Boolean = true

  given femalePairing: GenderPairing[Female.type] with
    def pair(x: Female.type, y: Female.type): Boolean = true
}