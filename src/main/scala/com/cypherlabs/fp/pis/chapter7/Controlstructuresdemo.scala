package com.cypherlabs.fp.pis.chapter7

object Controlstructuresdemo {

  def main(args: Array[String]): Unit = {
    // if is an expression and evaluates to a value, thus enabling declaring val rather than var
    val fileName = if(!args.isEmpty) args(0) else "defaultFile.txt"

    var x = 0
    //while and do-while are loop and not expressions,and returns unit value ()
    while(x<10){
      println(x)
      x += 1
    }
  }

}
