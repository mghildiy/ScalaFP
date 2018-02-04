package com.cypherlabs.fp

object MyModule {

  def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The "+name+ " of "+n+" is "+f(n);
    msg
  }

  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int = {
      if(n <= 0) acc else go(n-1,n*acc)
    }
    go(n,1)
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

  def isSorted[A] (as: Array[A],lt: (A,A) => Boolean): Boolean = {
    def go(current: Int, next: Int):Boolean = {
      if(next == as.length - 1) {
        if (lt(as(current), as(next))) true else false
      }else{
        if (lt(as(current), as(next))) go(next,next+1) else false
      }
    }

    if(as.length == 1){
      true
    }else {
      go(0, 1)
    }
  }

  def main(args: Array[String]): Unit = {
    println(formatResult("absolute value", -42, abs))
    println(formatResult("factorial", 7, factorial))
    println(formatResult("fibonacci", 7, fibonacci))
    println(formatResult("square",10,(n: Int) => n * n))
    println(formatResult("double",15,(n: Int) => {var double = n + n;double}))
    println(formatResult("decrement",11,(n: Int) => n - 1))

    val intArr = Array(32,33,44,67)
    println(isSorted(intArr,(x: Int,y: Int) => x < y))

    val strArr = Array("Hi","Hj")
    println(isSorted(strArr,(x: String,y: String) => x < y))
  }
}