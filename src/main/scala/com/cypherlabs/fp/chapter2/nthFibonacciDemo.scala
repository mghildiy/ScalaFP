package com.cypherlabs.fp.chapter2

object nthFibonacciDemo {

  def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The "+name+ " of "+n+" is "+f(n);
    msg
  }

  def fibonacci(n:Int): Int = {
    @scala.annotation.tailrec
    def go(count:Int, n1: Int, n2:Int): Int = {
      if(count == n){
        n1+n2
      }else{
        val x = n2
        val y = n1+n2
        go(count+1,x,y)
      }
    }
    if(n == 1){
      0
    }else{
      if(n == 2){
        1
      }else{
        go(3,0,1)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    println(formatResult("fibonacci", 7, fibonacci))
  }

}
