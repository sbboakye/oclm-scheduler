package com.sambeth.oclm.models


enum AppointedMan[G] {
  case Elder(name: String)
  case MinisterialServant(name: String)
}

object AppointedMan:
  def apply[G <: Gender](name: String, isElder: Boolean): AppointedMan[Gender] =
    if isElder then Elder(name)
    else MinisterialServant(name)