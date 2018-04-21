package concurrency

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.io.Source
object ReadFutureValueDemo extends App{
  val sbtFile: Future[String] = Future{
    val f = Source.fromFile("build.sbt")
    try f.getLines.mkString("\n") finally f.close()
  }
  println(s"started reading the build file asynchronously")
  println(s"status: ${sbtFile.isCompleted}")
  Thread.sleep(250)
  println(s"status: ${sbtFile.isCompleted}")
  println(s"value: ${sbtFile.value}")
}
