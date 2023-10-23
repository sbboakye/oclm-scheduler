package com.sambeth.oclm.models.appointedman


enum AppointedManAssignment:
  case OpeningPrayer[S <: AppointedManResponsibility](owner: AppointedMan[S])
  case TenMinutesTalk[S <: AppointedManResponsibility](owner: AppointedMan[S])
  case SpiritualGems[S <: AppointedManResponsibility](owner: AppointedMan[S])
  case AdHoc[S <: AppointedManResponsibility](title: String, owner: AppointedMan[S])
  case ClosingPrayer[S <: AppointedManResponsibility](owner: AppointedMan[S])