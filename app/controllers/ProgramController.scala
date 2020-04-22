package controllers

import data.ProgramData
import io.swagger.annotations.{Api, ApiOperation, ApiResponse, ApiResponses}
import javax.inject.Inject
import model.Program
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}

@Api(value = "Program", produces = "application/json", consumes = "application/json")
class ProgramController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  @ApiOperation(
    value = "Get all programs for a user",
    nickname = "getAllPrograms",
    httpMethod = "GET"
  )
  @ApiResponses(
    Array(
      new ApiResponse(code = 200, message = "Successfully returned programs", response = classOf[Program], responseContainer = "List"),
      new ApiResponse(code = 500, message = "Internal system error")
    )
  )
  def getProgramsForUser(rallyId: String) = Action  {
    Ok(Json.toJson(ProgramData.dataSet1))
  }

}
