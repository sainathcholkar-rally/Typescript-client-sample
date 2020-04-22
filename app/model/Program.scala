package model

import java.time.Instant

import play.api.libs.json.Json

case class Program(name: String,
                   displayName: String,
                   syllabusId: String,
                   hydraId: String,
                   enrolledDate: Option[Instant],
                   hasMilestones: Boolean,
                   isComplete: Boolean,
                   lastActivity: Option[Instant])
object Program {
  implicit val format = Json.format[Program]
}
