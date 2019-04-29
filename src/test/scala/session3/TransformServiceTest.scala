package session3

import org.scalatest.{FunSuite, Matchers}
import session3.models.Sighting
import session3.services.TransformService

import scala.io.Source

class TransformServiceTest extends FunSuite with Matchers {

  test("should create a Sighting from a String comma separate par of birdTypeId and countryName"){
    val inputString = "12, Italy"
    val expectedValue = Sighting(12, "Italy")
    val realValue: Sighting = TransformService.mapStringToSighting(inputString)
    realValue should be (expectedValue)
  }

  test("Should load a sightingsTest.txt example file and produce a clean list of Sighting"){
    //Read a file from resources folder and get all lines as a Seq[String]
    val lines = Source.fromResource("sightingsTest.txt").getLines().toSeq

    // Build our expectedSightingSeq Seq to check funtionality result is correct
    val expectedSightingSeq:Seq[Sighting] = Seq(
      Sighting(12, "Italy"),
      Sighting(3, "Germany"),
      Sighting(1, "Italy"),
      Sighting(56, "England"),
      Sighting(1, "Cuba"),
      Sighting(567, "Germany"),
      Sighting(1, "EEUU"),
    )

    //Call LoadAndTransform execute method to do transformation os Seq[String]
    //lines to Seq[Sighting]
    val realSightingSeq: Seq[Sighting] = TransformService.execute(lines)

    //Assert total count of lines is 7
    assert(realSightingSeq.size == 7)

    //Assert realSightingSeq is equal to expectedSightingSeq
    realSightingSeq should be (expectedSightingSeq)
  }
}
