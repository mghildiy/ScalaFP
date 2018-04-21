package concurrency

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
object FuturesDemo extends App{
  Future{println("Future is here")}
  println("Future is coming")
  Thread.sleep(500)
}
