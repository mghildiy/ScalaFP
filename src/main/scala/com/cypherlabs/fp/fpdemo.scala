package com.cypherlabs.fp

object fpdemo {

  case class Player(name: String, score: Int)
  def printWinner(p: Player): Unit =
    println(p.name + " is the winner!")
  def declareWinner(p1: Player, p2: Player): Unit =
    if (p1.score > p2.score) printWinner(p1)
    else printWinner(p2)

  def winnerPure(p1: Player, p2: Player): Player =
    if (p1.score > p2.score) p1 else p2
  def declareWinnerPure(p1: Player, p2: Player): Unit =
    printWinner(winnerPure(p1, p2))

  def main(args: Array[String]): Unit = {
    val players = List(Player("Sue", 7),
      Player("Bob", 8),
      Player("Joe", 4))
    val p = players.reduceLeft(winnerPure)
    println(p.name)
  }

}
