package com.sambeth.oclm.models.student

import com.sambeth.oclm.models.gender.Gender

enum PairedStudentAssignment:
  case InitialCall[G <: Gender](publisher: Student[G], householder: Student[G])
  case ReturnVisit[G <: Gender](publisher: Student[G], householder: Student[G])
  case BibleStudy[G <: Gender](publisher: Student[G], householder: Student[G])