package com.cypherlabs.fp.chapter2

object isSortedDemo {

  def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The "+name+ " of "+n+" is "+f(n);
    msg
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
    val intArrUnSorted = Array(34,33,44,67)
    println(isSorted(intArrUnSorted,(x: Int,y: Int) => x < y))

    val intArrSorted = Array(32,33,44,67)
    println(isSorted(intArrSorted,(x: Int,y: Int) => x < y))

    val strArrUnSorted = Array("L","J")
    println(isSorted(strArrUnSorted,(x: String,y: String) => x < y))

    val strArrSorted = Array("Hi","Hj")
    println(isSorted(strArrSorted,(x: String,y: String) => x < y))
  }

}
