package concurrency

import scala.concurrent.Future
import scala.io.Source
import scala.concurrent.ExecutionContext.Implicits.global

object FutureCallbackDemo extends App{
  def getUrlSpec(): Future[List[String]] = Future {
    val url = "http://www.w3.org/Addressing/URL" +
      "/url-spec.txt"

    val f = Source.fromURL(url)
    try f.getLines.toList finally f.close()
  }
  val urlSpec: Future[List[String]] = getUrlSpec()
  def find(lines: List[String], keyword: String): String = {
    lines.zipWithIndex collect {
      case (line, n) if line.contains(keyword) => (n, line)
    } mkString ("\n")
  }
  urlSpec foreach{
    case lines => println(find(lines,"telnet"))
  }
  urlSpec foreach {
    case lines => println(find(lines, "password"))
  }
  println("Continue with other work")
  Thread.sleep(5000)
}
