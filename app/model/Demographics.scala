package model

import play.api.libs.json.Json

case class Demographics(
                         firstName: String,
                         lastName: String,
                         dob: String
                       )

object Demographics {
  implicit val format = Json.format[Demographics]
}
