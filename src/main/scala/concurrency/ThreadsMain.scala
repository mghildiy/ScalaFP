package concurrency

object ThreadsMain {

  def main(args: Array[String]): Unit = {
    val t: Thread = Thread.currentThread
    val name = t.getName
    println(s"I am the thread $name")
  }
}
