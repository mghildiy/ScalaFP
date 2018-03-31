package com.cypherlabs.fp.pis.chapter6

// companion class to Rational singleton object
class Rational(n:Int,d:Int){
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  private val numer: Int = n/g
  private val denom: Int = d/g
  println("Members are:"+numer,denom)

  def this(n: Int) = this(n,1) // auxiliary constructor

  override def toString = numer + "/"+ denom

  def add(that: Rational) = {
    new Rational(numer * that.denom + that.numer * denom,denom * that.denom)
  }

  def +(that: Rational) = {
    new Rational(numer * that.denom + that.numer * denom,denom * that.denom)
  }

  def +(i: Int) = new Rational(numer + i * denom, denom)

  def -(that: Rational): Rational = new Rational(numer * that.denom - that.numer * denom,denom * that.denom)

  def -(i: Int): Rational = new Rational(numer - i* denom, denom)

  def * (that: Rational): Rational = new Rational(numer * that.numer, denom * that.denom)

  def *(i: Int): Rational = new Rational(numer * i, denom)

  def /(that: Rational): Rational = new Rational(numer * that.denom, denom * that.numer)

  def /(i: Int): Rational = new Rational(numer, denom * i)

  private def gcd(a: Int, b: Int):Int = {
    if(b == 0) a else gcd(b, a%b)
  }
}

// companion object to Rational class
object Rational{
  def main(args: Array[String]): Unit = {
    val oneHalf = new Rational(14,28)
    val twoThird = new Rational(2,3)
    println(oneHalf + twoThird)
    println(oneHalf * twoThird)
    println(oneHalf * 3)
    implicit def intToRational(i: Int): Rational = new Rational(i)

    println(3 * oneHalf)
  }
}

object Rtnl{

  def main(args: Array[String]): Unit = {
    val r = new Rational(1,2)
    println(r.toString)
  }
}
