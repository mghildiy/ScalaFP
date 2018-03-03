package prac.collections

import scala.collection.mutable.Map
import scala.collection.immutable.Map

object MapDemo {

  def main(args: Array[String]): Unit = {
    val myMutableMap = scala.collection.mutable.Map[Int, String]()
    myMutableMap += (1->"One")//myMutableMap.+=(1->"One")
    myMutableMap += (2->"Two")//myMutableMap.+=(2->"Two")
    println(myMutableMap)
    println(myMutableMap(1))

    var myImmutableMap = scala.collection.immutable.Map[Int, String]()
    println(myImmutableMap)
    myImmutableMap += (1->"One")//myImmutableMap = myImmutableMap + (1->"One")
    myImmutableMap += (2->"Two")//myImmutableMap = myImmutableMap + (2->"Two")
    println(myImmutableMap)
    println(myImmutableMap(1))

  }
}
