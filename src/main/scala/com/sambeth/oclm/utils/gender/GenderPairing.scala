package com.sambeth.oclm.utils.gender

import com.sambeth.oclm.models.{Female, Male}

trait GenderPairing[G] {
  def pair(x: G, y: G): Boolean
}

object GenderPairing {
  def apply[G](implicit gp: GenderPairing[G]): GenderPairing[G] = gp
  
  given malePairing: GenderPairing[Male] with
    def pair(x: Male, y: Male): Boolean = true

  given femalePairing: GenderPairing[Female] with
    def pair(x: Female, y: Female): Boolean = true
}