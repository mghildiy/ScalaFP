package concurrency

import java.util.concurrent.{ForkJoinPool, TimeUnit}

object ExecutorsDemo extends App{
  val executor = new ForkJoinPool()
  executor.execute(new Runnable{
    def run = println("Hello Executor!")
  })
  executor.shutdown()
  executor.awaitTermination(1, TimeUnit.SECONDS)
}
