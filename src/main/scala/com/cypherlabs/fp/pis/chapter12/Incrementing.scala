package com.cypherlabs.fp.pis.chapter12

trait Incrementing extends IntQueue {
  abstract override def put(x: Int) {
    println("In Incrementing's put")
    super.put(x + 1)
  }
}
