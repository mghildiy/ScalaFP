package com.cypherlabs.fp.pis.chapter15

import com.cypherlabs.fp.pis.chapter15.PatternMatchingDemo.Shape

import scala.util.Random

object PatternMatchingDemo extends App{
  def checkValue(x: Int) = x match {
    case 0 => "Nothing"
    case 1 => "Just one"
    case 2 => "Just two"
    case _ => "Many"
  }

  println(checkValue(5))

  abstract class Shape
  case class Triangle(base: Int, height: Int) extends Shape{
    def getArea() = (base * height) / 2
  }
  case class RectAngle(width: Int, height: Int) extends Shape{
    def getArea() = width * height
  }
  case class Circle(radius: Int) extends Shape{
    def getArea() = (Math.PI) * radius * radius
  }
  case class AnyOtherShape(name: String) extends Shape

  def getShapeArea(shape: Shape): Any = {
    shape match {
      case Triangle(base, height) => (base * height) / 2
      case RectAngle(width, height) => width * height
      case Circle(radius) => (Math.PI) * radius * radius
      case _ => "Can't calculate"
    }
  }

  println(getShapeArea(Triangle(10,6)))
  println(getShapeArea(Circle(10)))
  println(getShapeArea(AnyOtherShape("Arbitrary shape")))

  abstract class Automobile
  case class Car(brand: String, buildYear: Int) extends Automobile{
    def getCarDescription() = s"This is a $brand, built in year $buildYear"
  }
  case class Crane(height: Int, capacity: Int) extends Automobile{
    def getCraneDescription() = s"This is a $height meters high, $capacity tons capacity crane"
  }

  def getAutomobileDescription(automobile: Automobile): Any = {
    automobile match {
      case car:Car => car.getCarDescription()
      case crane:Crane => crane.getCraneDescription()
      case _ => "No description available"
    }
  }

  println(getAutomobileDescription(Car("BMW", 2005)))
  println(getAutomobileDescription(Crane(30, 1500)))

}
