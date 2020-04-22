package model

import play.api.libs.json.Json

case class UserBenefitsResponse(
                                 benefits: Seq[BenefitModel],
                                 demographics: Option[Demographics]
                               )

object UserBenefitsResponse {
  implicit val format = Json.format[UserBenefitsResponse]
}
