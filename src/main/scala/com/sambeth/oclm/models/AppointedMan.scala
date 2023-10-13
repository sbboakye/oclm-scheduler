package com.sambeth.oclm.models


enum AppointedMan {
  case Elder(name: String)
  case MinisterialServant(name: String)
}

object AppointedMan:
  def apply(name: String, isElder: Boolean): AppointedMan =
    if isElder then Elder(name)
    else MinisterialServant(name)