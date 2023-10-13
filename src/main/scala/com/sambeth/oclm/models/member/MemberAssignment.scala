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
  def apply[G <: Gender](nameOfAssignment: String, owner: Member[G], support: Option[Member[G]]): MemberAssignment =
    nameOfAssignment match
      case "InitialCall" => InitialCall(owner, support.get)
      case "ReturnVisit" => ReturnVisit(owner, support.get)
      case "BibleStudy" => BibleStudy(owner, support.get)

  def apply(nameOfAssignment: String, owner: Member[Male.type]): MemberAssignment =
    nameOfAssignment match
      case "BibleReading" => BibleReading(owner)
      case "FiveMinutesTalk" => FiveMinutesTalk(owner)
}