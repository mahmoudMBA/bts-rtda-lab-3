package session3.models

case class MostCommonBirdView(birdId: Int, count: Int) extends View {

  override def toString: String = {
    s"(Most Common Bird: $birdId, $count)"
  }

  override def name(): String = "most_common_bird_view"
}
