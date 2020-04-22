package data

import java.util.GregorianCalendar

import model.Program

object ProgramData {
  private val enrolledDate1 = new GregorianCalendar(2014, 2, 11)
  private val enrolledDate2 = new GregorianCalendar(2014, 5, 27)
  private val enrolledDate3 = new GregorianCalendar(2016, 11, 1)
  private val lastActivity1 = new GregorianCalendar(2020, 5, 15)
  private val lastActivity2 = new GregorianCalendar(2018, 8, 21)
  private val lastActivity3 = new GregorianCalendar(2020, 6, 10)

  val dataSet1 = List(
    Program(name = "David",
      displayName = "David",
      syllabusId = "1234",
      hydraId = "7865",
      enrolledDate = Some( enrolledDate1.toInstant ),
      hasMilestones = false,
      isComplete = false,
      lastActivity = Some( lastActivity1.toInstant )),
    Program(name = "Francis",
      displayName = "Francis",
      syllabusId = "0163",
      hydraId = "5634",
      enrolledDate = Some( enrolledDate2.toInstant ),
      hasMilestones = false,
      isComplete = false,
      lastActivity = Some( lastActivity2.toInstant )),
    Program(name = "Chuck",
      displayName = "Chuck",
      syllabusId = "6823",
      hydraId = "3427",
      enrolledDate = Some( enrolledDate3.toInstant ),
      hasMilestones = false,
      isComplete = false,
      lastActivity = Some( lastActivity3.toInstant ))
  )

}
