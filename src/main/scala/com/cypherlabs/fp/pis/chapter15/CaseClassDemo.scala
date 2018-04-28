package com.cypherlabs.fp.pis.chapter15

object CaseClassDemo extends App{

  case class Player(name: String, sport: String, club: String)

  val m = Player("Messi","Football","Barcelona")

  val r = m.copy(name = "Ronaldo", club = "Real Madrid")

  println(m == r)

}
