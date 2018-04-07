package com.cypherlabs.fp.pis.chapter9

//high-order function to reduce code duplication
object BasicMathOperationsOnListPair {

  def add2Lists(intsX: List[Int],intsY: List[Int]) = {
    val sum = for ((x, y) <- (intsX zip intsY)) yield x + y
    sum
  }

  def multiply2Lists(intsX: List[Int],intsY: List[Int]) = {
    val mult = for ((x, y) <- (intsX zip intsY)) yield x * y
    mult
  }

  def subtract2Lists(intsX: List[Int],intsY: List[Int]) = {
    val subtract = for ((x, y) <- (intsX zip intsY)) yield x - y
    subtract
  }

  private def applyOpOnListsPairwise(intsX: List[Int], intsY: List[Int], op:(Int,Int) => Int) = {
    val result = for ((x, y) <- (intsX zip intsY)) yield op(x,y)
    result
  }

  def add2ListsFPWay(intsX: List[Int],intsY: List[Int]) = {
    applyOpOnListsPairwise(intsX,intsY, (x:Int,y:Int) => x + y)
  }

  def multiply2ListsFPWay(intsX: List[Int],intsY: List[Int]) = {
    applyOpOnListsPairwise(intsX,intsY, (x:Int,y:Int) => x * y)
  }

  def subtract2ListsFPWay(intsX: List[Int],intsY: List[Int]) = {
    applyOpOnListsPairwise(intsX,intsY, (x:Int,y:Int) => x - y)
  }

  def main(args: Array[String]): Unit = {
    println("Sum")
    println(add2Lists(List(1,2,3),List(4,5,6)))
    println(add2ListsFPWay(List(1,2,3),List(4,5,6)))

    println("Multiply")
    println(multiply2Lists(List(1,2,3),List(4,5,6)))
    println(multiply2ListsFPWay(List(1,2,3),List(4,5,6)))

    println("Subtract")
    println(subtract2Lists(List(1,2,3),List(4,5,6)))
    println(subtract2ListsFPWay(List(1,2,3),List(4,5,6)))
  }
}
