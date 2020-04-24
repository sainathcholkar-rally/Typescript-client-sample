package data

import java.util.GregorianCalendar

import model.{BenefitModel, Demographics, UserBenefitsResponse}

object UserBenefitsResponseData {

  private val effectiveDate1 = new GregorianCalendar(2014, 2, 11, 11, 40, 40)
  private val terminationDate1 = new GregorianCalendar(2020, 2, 11, 9, 47, 40)
  private val lastUpdated1 = new GregorianCalendar(2020, 2, 12, 1, 12, 40)

  private val effectiveDate2 = new GregorianCalendar(2016, 11, 1, 12, 34, 40)
  private val terminationDate2 = new GregorianCalendar(2019, 7, 21, 8, 54, 40)
  private val lastUpdated2 = new GregorianCalendar(2018, 3, 2, 7, 32, 40)

  private val effectiveDate3 = new GregorianCalendar(2017, 2, 11, 6, 9, 40)
  private val terminationDate3 = new GregorianCalendar(2018, 2, 11, 11, 4, 40)

  private val effectiveDate4 = new GregorianCalendar(1999, 2, 11, 10, 54, 40)
  private val terminationDate4 = new GregorianCalendar(2000, 7, 11, 5, 45, 40)

  private val effectiveDate5 = new GregorianCalendar(2019, 4, 11, 3, 45, 40)
  private val terminationDate5 = new GregorianCalendar(2020, 2, 11, 4, 45, 40)

  private val effectiveDate6 = new GregorianCalendar(2013, 9, 14, 1, 45, 40)
  private val terminationDate6 = new GregorianCalendar(2020, 2, 11, 2, 45, 40)

  private val effectiveDate7 = new GregorianCalendar(2002, 2, 11, 10, 45, 40)
  private val terminationDate7 = new GregorianCalendar(2020, 2, 11, 10, 45, 40)

  private val effectiveDate8 = new GregorianCalendar(2003, 2, 11, 9, 45, 40)
  private val terminationDate8 = new GregorianCalendar(2020, 2, 11, 8, 45, 40)

  private val effectiveDate9 = new GregorianCalendar(2004, 2, 11, 6, 45, 40)
  private val terminationDate9 = new GregorianCalendar(2020, 2, 11, 5, 45, 40)

  private val effectiveDate10 = new GregorianCalendar(2020, 2, 11, 4, 45, 40)
  private val terminationDate10 = new GregorianCalendar(2020, 2, 11, 1, 45, 40)

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
      guestUrl = Some("http://google.com")),
    BenefitModel(coverageType = "Term",
      carrierName = Some("cname1"),
      benefitName = Some("bname1"),
      groupNumber = Some("9382"),
      isUHC = Some(true),
      memberId = Some("8237"),
      networkId = Some("0912"),
      status = "Active",
      effectiveDate = Some( effectiveDate3.toZonedDateTime.toLocalDate ),
      terminationDate = Some( terminationDate3.toZonedDateTime.toLocalDate ),
      lastUpdated = lastUpdated1.toInstant,
      guestUrl = Some("http://google.com")),
    BenefitModel(coverageType = "Life",
      carrierName = Some("cname2"),
      benefitName = Some("bname2"),
      groupNumber = Some("7832"),
      isUHC = Some(false),
      memberId = Some("09012"),
      networkId = Some("98893"),
      status = "InActive",
      effectiveDate = Some( effectiveDate3.toZonedDateTime.toLocalDate ),
      terminationDate = Some( terminationDate3.toZonedDateTime.toLocalDate ),
      lastUpdated = lastUpdated2.toInstant,
      guestUrl = Some("http://google.com")),
    BenefitModel(coverageType = "Term",
      carrierName = Some("carriern1"),
      benefitName = Some("benefitn1"),
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
      carrierName = Some("carriern2"),
      benefitName = Some("benefitn12"),
      groupNumber = Some("7832"),
      isUHC = Some(false),
      memberId = Some("09012"),
      networkId = Some("98893"),
      status = "InActive",
      effectiveDate = Some( effectiveDate4.toZonedDateTime.toLocalDate ),
      terminationDate = Some( terminationDate4.toZonedDateTime.toLocalDate ),
      lastUpdated = lastUpdated2.toInstant,
      guestUrl = Some("http://google.com")),
    BenefitModel(coverageType = "Term",
      carrierName = Some("carrier"),
      benefitName = Some("banefit"),
      groupNumber = Some("9382"),
      isUHC = Some(true),
      memberId = Some("8237"),
      networkId = Some("0912"),
      status = "Active",
      effectiveDate = Some( effectiveDate5.toZonedDateTime.toLocalDate ),
      terminationDate = Some( terminationDate5.toZonedDateTime.toLocalDate ),
      lastUpdated = lastUpdated1.toInstant,
      guestUrl = Some("http://google.com")),
    BenefitModel(coverageType = "Life",
      carrierName = Some("carrier1"),
      benefitName = Some("benefit1"),
      groupNumber = Some("7832"),
      isUHC = Some(false),
      memberId = Some("09012"),
      networkId = Some("98893"),
      status = "InActive",
      effectiveDate = Some( effectiveDate6.toZonedDateTime.toLocalDate ),
      terminationDate = Some( terminationDate6.toZonedDateTime.toLocalDate ),
      lastUpdated = lastUpdated2.toInstant,
      guestUrl = Some("http://google.com")),
    BenefitModel(coverageType = "Term",
      carrierName = Some("carrier Name1"),
      benefitName = Some("benefit Name1"),
      groupNumber = Some("9382"),
      isUHC = Some(true),
      memberId = Some("8237"),
      networkId = Some("0912"),
      status = "Active",
      effectiveDate = Some( effectiveDate7.toZonedDateTime.toLocalDate ),
      terminationDate = Some( terminationDate7.toZonedDateTime.toLocalDate ),
      lastUpdated = lastUpdated1.toInstant,
      guestUrl = Some("http://google.com")),
    BenefitModel(coverageType = "Life",
      carrierName = Some("carrier Name2"),
      benefitName = Some("benefit Name2"),
      groupNumber = Some("7832"),
      isUHC = Some(false),
      memberId = Some("09012"),
      networkId = Some("98893"),
      status = "InActive",
      effectiveDate = Some( effectiveDate8.toZonedDateTime.toLocalDate ),
      terminationDate = Some( terminationDate8.toZonedDateTime.toLocalDate ),
      lastUpdated = lastUpdated2.toInstant,
      guestUrl = Some("http://google.com")),
    BenefitModel(coverageType = "Term",
      carrierName = Some("car"),
      benefitName = Some("ben"),
      groupNumber = Some("9382"),
      isUHC = Some(true),
      memberId = Some("8237"),
      networkId = Some("0912"),
      status = "Active",
      effectiveDate = Some( effectiveDate9.toZonedDateTime.toLocalDate ),
      terminationDate = Some( terminationDate9.toZonedDateTime.toLocalDate ),
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
      effectiveDate = Some( effectiveDate10.toZonedDateTime.toLocalDate ),
      terminationDate = Some( terminationDate10.toZonedDateTime.toLocalDate ),
      lastUpdated = lastUpdated2.toInstant,
      guestUrl = Some("http://google.com"))
  )

  val dataSet1 = UserBenefitsResponse(benefits = benefits,
    demographics = Some(demographics))

}
