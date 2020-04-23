package controllers

import data.{CcfBenefitModelData, UserBenefitsResponseData}
import io.swagger.annotations.{Api, ApiImplicitParam, ApiImplicitParams, ApiOperation, ApiResponse, ApiResponses}
import javax.inject.Inject
import model.{CcfBenefitModel, UserBenefitsResponse}
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}

@Api(value = "Benefit", produces = "application/json", consumes = "application/json")
class BenefitController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  @ApiOperation(
    value = "Get all benefits for a user",
    nickname = "getAllBenefits",
    httpMethod = "GET"
  )
  @ApiResponses(
    Array(
      new ApiResponse(code = 200, message = "Successfully returned benefits", response = classOf[UserBenefitsResponse]),
      new ApiResponse(code = 500, message = "Internal system error")
    )
  )
  def getBenefitsForUser(rallyId: String) = Action {
    Ok(Json.toJson(UserBenefitsResponseData.dataSet1))
  }

  @ApiOperation(
    value = "Get ccf benefits for a user",
    nickname = "getCcfenefits",
    httpMethod = "GET"
  )
  @ApiResponses(
    Array(
      new ApiResponse(code = 200, message = "Successfully returned ccf benefits", response = classOf[CcfBenefitModel], responseContainer = "List"),
      new ApiResponse(code = 500, message = "Internal system error")
    )
  )
  def getCcfBenefitsForUser(rallyId: String) = Action {
    Ok(Json.toJson(CcfBenefitModelData.dataSet1))
  }


  @ApiOperation(
    value = "Register user for a medical plan",
    nickname = "invokePlanPickup",
    httpMethod = "POST"
  )
  @ApiImplicitParams(
    Array(
      new ApiImplicitParam(
        name = "body",
        required = true,
        value = "JSON body describing benefit",
        paramType = "body",
        defaultValue = "",
        dataType = "model.UserRegistrationRequest"
      )
    )
  )
  @ApiResponses(
    Array(
      new ApiResponse(code = 204, message = "Successfully created plan", response = classOf[Void]),
      new ApiResponse(code = 500, message = "Internal system error")
    )
  )
  def registerUser(rallyId: String) = Action {
    NoContent
  }
}
