package concurrency

object ThreadCreation extends App{

  class MyThread extends Thread {
    override def run = {
      println("New thread executing")
      Thread.sleep(20000)
      println("New thread awake")
    }
  }

  val th = new MyThread
  th.start
  th.join
  println("New thread over")
  Thread.sleep(50000)
  println("Main thread over")

}
