package session3.models

case class CountrySightedCountView (counting:Int ) extends View {
  override def toString: String = {
    s"Total sightings: $counting"
  }

  override def name(): String = "country_sighted_count_view"

}
