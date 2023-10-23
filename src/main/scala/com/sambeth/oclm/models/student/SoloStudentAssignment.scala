package com.sambeth.oclm.models.student

import com.sambeth.oclm.models.gender.Gender.Male

enum SoloStudentAssignment:
  case BibleReading(student: Student[Male.type])
  case FiveMinutesTalk(student: Student[Male.type])