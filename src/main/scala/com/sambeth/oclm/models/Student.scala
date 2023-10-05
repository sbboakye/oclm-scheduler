package com.sambeth.oclm.models


enum Student[G]:
  case FemaleStudent(name: String)
  case MaleStudent(name: String)


object Student:
  def apply[G <: Gender](name: String, gender: G): Student[G] = gender match
    case Female => FemaleStudent(name)
    case Male => MaleStudent(name)

  extension [G](s: Student[G])
    def pair(s1: Student[G]): Boolean = true