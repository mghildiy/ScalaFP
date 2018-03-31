package prac

import scala.annotation.tailrec

class Trivials(s:String){
  private val x = 0
  private val y = 2
}

object Trivials {
  private val y = 1
  def main(args: Array[String]): Unit = {
    var Trivials = new Trivials("Trivials")
    println(Trivials.x)
    println(Trivials.y)

    // tail-recursive solution
    def sum(list: List[Int]): Int = {
      @tailrec
      def sumWithAccumulator(list: List[Int], currentSum: Int): Int = {
        list match {
          case Nil => {
            val stackTraceAsArray = Thread.currentThread.getStackTrace
            stackTraceAsArray.foreach(println)
            currentSum
          }
          case x :: xs => sumWithAccumulator(xs, currentSum + x)
        }
      }
      sumWithAccumulator(list, 0)
    }
    println(sum(List(1,2,3,4,5,6)))

  }
}
