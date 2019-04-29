package session3.cli

import session3.models.{Sighting, View}
import session3.services.{ConsoleViewWriterService, TransformService, ViewCreatorService, ViewWriter}

import scala.io.Source

object BirdInsightViewCreatorApp {
  val inputFileName: String = "/tmp/sightings.txt"

  def main(args: Array[String]): Unit = {
    val lines = Source.fromFile(inputFileName).getLines().toSeq
    val sightings: Seq[Sighting] = TransformService.execute(lines)

    var views: List[View] = List[View]()
    views ::= ViewCreatorService.createTotalAmountView(sightings)
    views ::= ViewCreatorService.createUniquesBirdTypeDetectedView(sightings)
    views ::= ViewCreatorService.createMostCommonBirdView(sightings)

    val writer: ViewWriter = new ConsoleViewWriterService()
    for (view <- views) {
      writer.write(view)
    }
  }
}
