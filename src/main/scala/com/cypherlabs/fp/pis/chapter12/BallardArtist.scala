package com.cypherlabs.fp.pis.chapter12

class BallardArtist extends Person with Poet with Artist{
  override def toString = "I write Ballard"

  override def writePoem = {
    println("Don't Tell Mama I Was Drinking...")
  }
}