package com.sambeth.oclm.models.appointedman

import com.sambeth.oclm.models.appointedman.AppointedManAssignment.{AdHoc, ClosingPrayer, OpeningPrayer, SpiritualGems, TenMinutesTalk}
import com.sambeth.oclm.models.appointedman.ElderAssignment.{Chairman, CongregationBibleStudy}
import com.sambeth.oclm.models.appointedman.AppointedManResponsibility.Elder


case class AppointedMan[S <: AppointedManResponsibility](name: String)


object AppointedMan:
  extension[S <: AppointedManResponsibility] (owner: AppointedMan[S])
    def assignOpeningPrayer: AppointedManAssignment = OpeningPrayer(owner)
    def assignTenMinutesTalk: AppointedManAssignment = TenMinutesTalk(owner)
    def assignSpiritualGems: AppointedManAssignment = SpiritualGems(owner)
    def assignAdHoc(theme: String): AppointedManAssignment = AdHoc(theme, owner)
    def assignClosingPrayer: AppointedManAssignment = ClosingPrayer(owner)

  extension[S <: AppointedManResponsibility] (owner: AppointedMan[Elder.type])
    def assignChairman: ElderAssignment = Chairman(owner)
    def assignCongregationBibleStudy: ElderAssignment = CongregationBibleStudy(owner)
