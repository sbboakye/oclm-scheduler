package com.sambeth.oclm.models

enum StudentAssignment {
  case BibleReading[Male](student: Student[Male])
  case InitialCall[G](publisher: Student[G], householder: Student[G])
  case ReturnVisit[G](publisher: Student[G], householder: Student[G])
  case BibleStudy[G](publisher: Student[G], householder: Student[G])
  case FiveMinutesTalk[Male](student: Student[Male])
}

object StudentAssignment {
  def apply[G <: Gender](nameOfAssignment: String, owner: Student[G], support: Option[Student[G]]): StudentAssignment =
    nameOfAssignment match
      case "BibleReading" => BibleReading(owner)
      case "InitialCall" => InitialCall[G](owner, support.get)
      case "ReturnVisit" => ReturnVisit[G](owner, support.get)
      case "BibleStudy" => BibleStudy[G](owner, support.get)
      case "FiveMinutesTalk" => FiveMinutesTalk(owner)
}