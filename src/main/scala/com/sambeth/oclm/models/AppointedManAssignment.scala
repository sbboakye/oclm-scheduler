package com.sambeth.oclm.models

enum AppointedManAssignment {
  case Chairman[Elder](owner: Elder)
  case OpeningPrayer(owner: AppointedMan)
  case TenMinutesTalk(owner: AppointedMan)
  case SpiritualGems(owner: AppointedMan)
  case AdHoc(title: String, owner: AppointedMan)
  case CongregationBibleStudy[Elder](owner: Elder)
  case ClosingPrayer(owner: AppointedMan)
}

object AppointedManAssignment {
  def apply(nameOfAssignment: String, owner: AppointedMan, title: Option[String]): AppointedManAssignment =
    nameOfAssignment match
      case "Chairman" => Chairman(owner)
      case "OpeningPrayer" => OpeningPrayer(owner)
      case "TenMinutesTalk" => TenMinutesTalk(owner)
      case "SpiritualGems" => SpiritualGems(owner)
      case "AdHoc" => AdHoc(title.get, owner)
      case "CongregationBibleStudy" => CongregationBibleStudy(owner)
      case "ClosingPrayer" => ClosingPrayer(owner)
}