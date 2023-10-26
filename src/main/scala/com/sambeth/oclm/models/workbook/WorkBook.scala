package com.sambeth.oclm.models.workbook

import com.sambeth.oclm.models.appointedman.ElderAssignment.{Chairman, CongregationBibleStudy, InitialCallVideo, ReturnVisitVideo}
import com.sambeth.oclm.models.appointedman.AppointedManAssignment.{OpeningPrayer, ClosingPrayer, TenMinutesTalk, SpiritualGems, AdHoc}
import com.sambeth.oclm.models.appointedman.AppointedManResponsibility.{Elder, MinisterialServant}
import com.sambeth.oclm.models.student.PairedStudentAssignment.{InitialCall, ReturnVisit, BibleStudy}
import com.sambeth.oclm.models.student.SoloStudentAssignment.{BibleReading, FiveMinutesTalk}
import com.sambeth.oclm.models.gender.Gender.{Male, Female}


case class WorkBook(
                     period: String,
                     chairman: Chairman,
                     openingPrayer: OpeningPrayer[MinisterialServant.type | Elder.type],
                     closingPrayer: ClosingPrayer[MinisterialServant.type | Elder.type],
                     tenMinutesTalk: TenMinutesTalk[MinisterialServant.type | Elder.type],
                     spiritualGems: SpiritualGems[MinisterialServant.type | Elder.type],
                     bibleReading: BibleReading,
                     initialCallVideo: Option[InitialCallVideo] = None,
                     returnVisitVideo: Option[ReturnVisitVideo] = None,
                     initialCall: Option[InitialCall[Female.type | Male.type]] = None,
                     returnVisit: Option[ReturnVisit[Female.type | Male.type]] = None,
                     bibleStudy: Option[BibleStudy[Female.type | Male.type]] = None,
                     fiveMinutesTalk: Option[FiveMinutesTalk] = None,
                     adHoc: List[AdHoc[MinisterialServant.type | Elder.type]] = List.empty,
                     congregationBibleStudy: CongregationBibleStudy
                   )
