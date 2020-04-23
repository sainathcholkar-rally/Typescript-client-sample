package model

import play.api.libs.json.Json

case class UserRegistrationRequest(
                                    internalPlanId: String,
                                    firstName: Option[String],
                                    lastName: Option[String],
                                    dob: Option[String],
                                    memberId: Option[String]
                                  )

object UserRegistrationRequest {
  implicit val format = Json.format[UserRegistrationRequest]
}