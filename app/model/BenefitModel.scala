package model

import java.time.{Instant, LocalDate}

import play.api.libs.json.Json

case class BenefitModel( coverageType: String,
                         carrierName: Option[String],
                         benefitName: Option[String],
                         groupNumber: Option[String],
                         isUHC: Option[Boolean],
                         memberId: Option[String],
                         networkId: Option[String],
                         status: String,
                         effectiveDate: Option[LocalDate],
                         terminationDate: Option[LocalDate],
                         lastUpdated: Instant,
                         guestUrl: Option[String] )

object BenefitModel {
  implicit val format = Json.format[BenefitModel]
}
