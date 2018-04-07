package com.cypherlabs.fp.pis.chapter9

object Currying {

  def plainCommonSum(x: Int, y: Int) = x + y

  def curriedSum(x: Int)(y: Int) = x + y

  def greetSomeOne(greeting: String)(name: String) = greeting + " " +name

  val tenPlus = curriedSum(10)_

  val greetHi = greetSomeOne("Hi")_
  val greetHello = greetSomeOne("Hello")_

  def printNTimes(str1: String)(n: Int)(str2: String) = {
    for(i <- 1 to n){
      println(str1 + str2)
    }
  }

  val printScala = printNTimes("Scala")_
  val print5Times = printScala(5)

  def main(args: Array[String]): Unit = {
    println(tenPlus(2))
    println(greetHi("World"))
    println(greetHello("World"))
    print5Times(" wins")
  }

}
