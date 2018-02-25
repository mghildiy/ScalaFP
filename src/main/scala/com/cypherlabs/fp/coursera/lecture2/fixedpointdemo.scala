package com.cypherlabs.fp.coursera.lecture2

import math.abs

object fixedpointdemo  extends App{
  val tolerance = 0.00001
  def isCloseEonugh(x: Double, y: Double) = {
    abs((x - y)/x)/x < tolerance
  }

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      if(isCloseEonugh(guess,next)) next
      else iterate(next)
    }

    iterate(firstGuess)
  }

  println(fixedPoint(x => 1 + x/2)(1))

}
