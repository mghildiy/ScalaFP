package com.cypherlabs.fp.pis.chapter12

import com.cypherlabs.fp.pis.chapter12.BallardArtist
import com.cypherlabs.fp.pis.chapter12.Poet

object DemoTrait {
  def main(args: Array[String]): Unit = {
    val ballardArtist = new BallardArtist
    ballardArtist.writePoem

    val poet:Poet = ballardArtist
    poet.writePoem()
  }
}
