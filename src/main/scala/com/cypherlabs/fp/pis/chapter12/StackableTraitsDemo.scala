package com.cypherlabs.fp.pis.chapter12

object StackableTraitsDemo {
  def main(args: Array[String]): Unit = {
    val doublingQueue = new BasicIntQueue with Doubling
    doublingQueue.put(10)
    println(doublingQueue.get())

    val incrThendoublingQueue = new BasicIntQueue with Doubling with Incrementing
    incrThendoublingQueue.put(10)
    println(incrThendoublingQueue.get())

    val doublingThenIncrQueue = new BasicIntQueue with Incrementing with Doubling
    doublingThenIncrQueue.put(10)
    println(doublingThenIncrQueue.get())
  }
}
