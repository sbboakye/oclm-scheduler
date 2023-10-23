package com.sambeth.oclm.models.student


import com.sambeth.oclm.models.gender.Gender
import com.sambeth.oclm.models.gender.Gender.Male
import com.sambeth.oclm.models.student.PairedStudentAssignment.{BibleStudy, InitialCall, ReturnVisit}
import com.sambeth.oclm.models.student.SoloStudentAssignment.{BibleReading, FiveMinutesTalk}

case class Student[G <: Gender](name: String)


object Student:
  extension [G <: Gender](publisher: Student[G])
    def pair(assitant: Student[G]): Boolean = true
    def assignInitialCall(householder: Student[G]): PairedStudentAssignment = InitialCall(publisher, householder)
    def assignReturnVisit(householder: Student[G]): PairedStudentAssignment = ReturnVisit(publisher, householder)
    def assignBibleStudy(householder: Student[G]): PairedStudentAssignment = BibleStudy(publisher, householder)

  extension [G <: Gender](owner: Student[Male.type])
    def assignBibleReading: SoloStudentAssignment = BibleReading(owner)
    def assignFiveMinutesTalk: SoloStudentAssignment = FiveMinutesTalk(owner)
