package com.cypherlabs.fp.pis.chapter8

object ClosuresDemo extends App{
  val multiplyByTwo = (x: Int) => x * 2
  var factor = 1
  val multiply = (x: Int) => x * factor
  println(multiply(10))
  factor = 2
  println(multiply(10))
}
