package session3.services

import java.io.{BufferedWriter, File, FileWriter}

import session3.models.View

class FileViewWriterService() extends ViewWriter {
  override def write(view: View): Unit = {
    val file = new File(s"${view.name()}.txt")
    val bw = new BufferedWriter(new FileWriter(file))
    bw.write(view.toString())
    bw.close()
    Console.println("File created on: " + file.getAbsolutePath)
  }
}
