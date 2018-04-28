package com.cypherlabs.fp.pis.chapter8

object PartiallyAppliedFunctionDemo extends App{
  val product = (x: Int,y: Int,z: Int) => x * y * z
  val p = product(3, 2, _: Int)
  println(p(5))
}
