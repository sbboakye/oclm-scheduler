package com.sambeth.oclm.models.member

import com.sambeth.oclm.models.gender.Gender
import com.sambeth.oclm.models.gender.Gender.Male
import com.sambeth.oclm.models.member.Member.*
import com.sambeth.oclm.models.member.{Member, MemberAssignment}

enum MemberAssignment {
  case BibleReading(student: Member[Male.type])
  case InitialCall[G](publisher: Member[G], householder: Member[G])
  case ReturnVisit[G](publisher: Member[G], householder: Member[G])
  case BibleStudy[G](publisher: Member[G], householder: Member[G])
  case FiveMinutesTalk(student: Member[Male.type])
}

object MemberAssignment {
  def apply[G](assignmentName: String, owner: Member[G], support: Member[G]): MemberAssignment =
    assignmentName match
      case "InitialCall" => InitialCall(owner, support)
      case "ReturnVisit" => ReturnVisit(owner, support)
      case "BibleStudy" => BibleStudy(owner, support)

  def apply(assignmentName: String, owner: Member[Male.type]): MemberAssignment =
    assignmentName match
      case "BibleReading" => BibleReading(owner)
      case "FiveMinutesTalk" => FiveMinutesTalk(owner)
}