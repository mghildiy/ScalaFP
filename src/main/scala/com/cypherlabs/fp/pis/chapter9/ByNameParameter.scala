package com.cypherlabs.fp.pis.chapter9

object ByNameParameter {

  def myWhileLoop(condition: => Boolean)(body: => Unit): Unit =
    if (condition) {
      body
      myWhileLoop(condition)(body)
    }

  var i = 4
  myWhileLoop (i > 0) {
    println(i)
    i -= 1
  }  // prints 4,3,2,1

  def main(args: Array[String]): Unit = {

  }

}
