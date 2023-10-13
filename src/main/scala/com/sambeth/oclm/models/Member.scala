package com.sambeth.oclm.models


enum Member[G]:
  case Student(name: String) extends Member[G]


object Member:
  def apply[G <: Gender](name: String): Member[G] = Student(name)

  extension [G](s: Member[G])
    def pair(s1: Member[G]): Boolean = true