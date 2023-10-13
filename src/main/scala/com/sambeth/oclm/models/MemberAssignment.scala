package com.sambeth.oclm.models

import Gender.*
import Member.*

enum MemberAssignment {
  case BibleReading[G](student: Member[G])
  case InitialCall[G](publisher: Member[G], householder: Member[G])
  case ReturnVisit[G](publisher: Member[G], householder: Member[G])
  case BibleStudy[G](publisher: Member[G], householder: Member[G])
  case FiveMinutesTalk[G](student: Member[G])
}

object MemberAssignment {
  def apply[G <: Gender](nameOfAssignment: String, owner: Member[G], support: Option[Member[G]]): MemberAssignment =
    nameOfAssignment match
      case "BibleReading" => BibleReading(owner)
      case "InitialCall" => InitialCall(owner, support.get)
      case "ReturnVisit" => ReturnVisit(owner, support.get)
      case "BibleStudy" => BibleStudy(owner, support.get)
      case "FiveMinutesTalk" => FiveMinutesTalk(owner)
}