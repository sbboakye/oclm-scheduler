package com.sambeth.oclm.models.member


import com.sambeth.oclm.models.gender.Gender

enum Member[G]:
  case Student(name: String) extends Member[G]

  def assign(assignmentName: String, support: Option[Member[G]]): MemberAssignment = support match
    case None => MemberAssignment(assignmentName, this.asInstanceOf[Member[Gender.Male.type]])
    case Some(student) => MemberAssignment(assignmentName, this, student)


object Member:
  def apply[G <: Gender](name: String): Member[G] = Student(name)

  extension [G](s: Member[G])
    def pair(s1: Member[G]): Boolean = true

//    def assign(assignmentName: String, support: Option[Member[G]]): MemberAssignment =
//      MemberAssignment[G](assignmentName, this, support)