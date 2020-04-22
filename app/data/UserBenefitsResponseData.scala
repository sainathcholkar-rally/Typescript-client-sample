package data

import java.util.GregorianCalendar

import model.{BenefitModel, Demographics, UserBenefitsResponse}

object UserBenefitsResponseData {

  private val effectiveDate1 = new GregorianCalendar(2014, 2, 11)
  private val terminationDate1 = new GregorianCalendar(2020, 2, 11)
  private val lastUpdated1 = new GregorianCalendar(2020, 2, 12)

  private val effectiveDate2 = new GregorianCalendar(2016, 11, 1)
  private val terminationDate2 = new GregorianCalendar(2019, 7, 21)
  private val lastUpdated2 = new GregorianCalendar(2018, 3, 2)

  private val demographics = Demographics(firstName = "James", lastName = "Gosling", dob = "07/21/1960")

  private val benefits = List(
    BenefitModel(coverageType = "Term",
      carrierName = Some("carrierName1"),
      benefitName = Some("benefitName1"),
      groupNumber = Some("9382"),
      isUHC = Some(true),
      memberId = Some("8237"),
      networkId = Some("0912"),
      status = "Active",
      effectiveDate = Some( effectiveDate1.toZonedDateTime.toLocalDate ),
      terminationDate = Some( terminationDate1.toZonedDateTime.toLocalDate ),
      lastUpdated = lastUpdated1.toInstant,
      guestUrl = Some("http://google.com")),
    BenefitModel(coverageType = "Life",
      carrierName = Some("carrierName2"),
      benefitName = Some("benefitName2"),
      groupNumber = Some("7832"),
      isUHC = Some(false),
      memberId = Some("09012"),
      networkId = Some("98893"),
      status = "InActive",
      effectiveDate = Some( effectiveDate2.toZonedDateTime.toLocalDate ),
      terminationDate = Some( terminationDate2.toZonedDateTime.toLocalDate ),
      lastUpdated = lastUpdated2.toInstant,
      guestUrl = Some("http://google.com"))
  )

  val dataSet1 = UserBenefitsResponse(benefits = benefits,
    demographics = Some(demographics))

}
