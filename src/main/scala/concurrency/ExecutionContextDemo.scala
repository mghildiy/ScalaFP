package concurrency

import scala.concurrent.ExecutionContext

object ExecutionContextDemo extends App{
  val execCtxt = ExecutionContext.global
  execCtxt.execute(new Runnable{
    def run = println("Hello ExecutionContext")
  })
  Thread.sleep(500)
}
