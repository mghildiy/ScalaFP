package com.cypherlabs.fp.pis.chapter8

object FirstClassFunctionDemo {
  val increment = (x: Int) => x+1

  def main(args: Array[String]): Unit = {
    println(increment(0))
    var anotherIncr = increment
  }
}
