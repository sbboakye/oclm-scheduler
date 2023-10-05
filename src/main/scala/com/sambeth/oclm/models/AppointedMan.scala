package com.sambeth.oclm.models


enum AppointedMan[G] {
  case Elder(name: String)
  case MinisterialServant(name: String)
}

object AppointedMan:
  def apply(name: String, isElder: Boolean): AppointedMan[Male] =
    if isElder then Elder(name)
    else MinisterialServant(name)