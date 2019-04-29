package session3.models

case class TotalAmountView(total: Int) extends View {
  override def toString: String = {
    s"$total"
  }

  override def name(): String = "total_amount_view"
}
