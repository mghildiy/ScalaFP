package com.cypherlabs.fp.pis.chapter12

trait Filtering extends IntQueue {
  abstract override def put(x: Int) {
    println("In Filtering's put")
    if (x >= 0) super.put(x)
  }
}
