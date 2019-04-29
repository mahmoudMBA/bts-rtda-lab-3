package session3.services

import session3.models.Sighting

object TransformService {
  def mapStringToSighting(inputString: String): Sighting = {
    //Get array of String by splitting inputString arg
    val par: Array[String] = inputString.split(",")

    //Get birdTypeId by trimming (remove spaces) par(0) and converting to Int
    val birdTypeId = par(0).trim.toInt

    //Get birdTypeId by trimming (remove spaces) par(1)
    val countryName = par(1).trim

    //Implicit return Sighting case class
    Sighting(birdTypeId, countryName)
  }

  def execute(lines: Seq[String]): Seq[Sighting] = {
    /*
      Transforming a Seq of string to a Seq of Sighting by using map
      functionality of collections and auxiliary method
      mapStringToSighting returning implicit by last line of function
    */
    lines.map(line => this.mapStringToSighting(line))
  }
}
