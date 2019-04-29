package session3.services

import session3.models.{View}

trait ViewWriter {
  def write(view: View): Unit
}
