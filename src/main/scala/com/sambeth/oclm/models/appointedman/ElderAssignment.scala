package com.sambeth.oclm.models.appointedman

import com.sambeth.oclm.models.appointedman.AppointedManResponsibility.Elder

enum ElderAssignment:
  case Chairman(owner: AppointedMan[Elder.type])
  case CongregationBibleStudy(owner: AppointedMan[Elder.type])