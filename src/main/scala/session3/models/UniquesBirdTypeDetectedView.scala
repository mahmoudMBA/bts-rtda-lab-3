package session3.models

case class UniquesBirdTypeDetectedView(uniques: Int) extends View {
  override def toString: String = {
    s"Uniques Bird Type Detected: $uniques"
  }

  override def name(): String = "uniques_birdType_detected_view"
}
