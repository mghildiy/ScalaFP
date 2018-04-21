package com.cypherlabs.fp.pis.chapter10

object AbstractClassDemo {

  def main(args: Array[String]): Unit = {
    abstract class Element{
      val contents: Array[String]
      protected val height = contents.length
      val width =
        if (height == 0) 0 else contents(0).length

      def getHeight = contents.length
      def getWidth = if (height == 0) 0 else contents(0).length
    }

    class ArrayElement(conts: Array[String]) extends Element {
      val contents: Array[String] = conts
      override def getHeight() = height
      override val height = 6
    }

    val ae = new ArrayElement(Array("Hi","World!"))
    //println(ae.height)
  }

}
