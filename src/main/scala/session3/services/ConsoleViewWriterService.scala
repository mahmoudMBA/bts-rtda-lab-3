package session3.services
import session3.models.View

class ConsoleViewWriterService extends ViewWriter {
  override def write(view: View): Unit = {
    Console.println("--------------------")
    Console.println(s"${view.name()}:")
    Console.println()
    Console.println(view.toString())
    Console.println("--------------------")
    Console.println()
  }
}
