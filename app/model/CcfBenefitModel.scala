package model

import play.api.libs.json.Json

case class CcfBenefitModel(
                            benefitId: String,
                            name: String
                          )

object CcfBenefitModel  {
  implicit val format = Json.format[CcfBenefitModel]
}
