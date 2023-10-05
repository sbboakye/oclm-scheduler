package com.sambeth.oclm.models


enum Student[G]:
  case FemaleStudent(name: String)
  case MaleStudent(name: String)


object Student:
  def apply[G <: Gender](name: String, gender: Gender): Student[Gender] = gender match
    case Female => FemaleStudent(name)
    case Male => MaleStudent(name)

  extension (s: Student[Gender]) def pair(s1: Student[Gender]): Boolean = (s, s1) match
    case (FemaleStudent(_), FemaleStudent(_)) => true
    case (MaleStudent(_), MaleStudent(_)) => true
    case (FemaleStudent(_), MaleStudent(_)) => false
    case (MaleStudent(_), FemaleStudent(_)) => false