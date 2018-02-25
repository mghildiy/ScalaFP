package com.cypherlabs.fp.coursera.lecture2

object productdemo extends App{

  def product(f: Int => Int)(a: Int, b: Int): Int = {
    if(a > b) 1
    else f(a) * product(f)(a+1, b)
  }

  println(product(x => x * x)(1,5))

  def factorial(n: Int):Int = {
    product(x => x)(1,n)
  }

  println(factorial(5))

}
