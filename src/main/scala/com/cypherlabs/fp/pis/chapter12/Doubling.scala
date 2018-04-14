package com.cypherlabs.fp.pis.chapter12

trait Doubling extends IntQueue{
    abstract override def put(x: Int) {
      println("In Doubling's put")
      super.put(2*x)
    }
}
