package com.cypherlabs.fp.pis.chapter8

import scala.annotation.tailrec

object TailRecursionDemo extends App{

  val sumTraditional = (list: List[Int]) => {
    var sum = 0;
    for(i <- list){
      sum += i
    }
    sum
  }
  println(sumTraditional(List(1,2,3,4,5)))

  def sumRecursive(list: List[Int]): Int = {
    list match {
      case Nil => 0
      case x::xs => x + sumRecursive(xs)
    }
  }
  println(sumRecursive(List(1,2,3,4,5)))

  @tailrec
  def sumTailRecursive(list: List[Int], accumulator: Int): Int = {
    list match {
      case Nil => accumulator
      case x::xs => {
        sumTailRecursive(xs,accumulator + x)
      }
    }
  }
  println(sumTailRecursive(List(1,2,3,4,5),0))

}
