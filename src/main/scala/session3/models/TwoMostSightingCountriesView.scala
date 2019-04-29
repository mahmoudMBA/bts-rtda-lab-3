package session3.models

case class TwoMostSightingCountriesView(uniques: String) extends View {
  override def toString: String = {
    s"Total sightings: $uniques"
  }

  override def name(): String = "two_most_sighting_countries_view"
}
