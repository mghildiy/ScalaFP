package com.cypherlabs.fp.pis.chapter8

object MethodDemo extends App{

  def isGreaterThan2(i: Int) = {
    println("Inside isGreaterThan2")
    i > 2
  }

  println(MethodDemo.isGreaterThan2(7))
  println(MethodDemo.isGreaterThan2(1))
}
