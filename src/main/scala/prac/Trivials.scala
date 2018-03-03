package prac

object Trivials {

  def main(args: Array[String]): Unit = {
    //two kinds of variables
    //val can't be reassigned once initialized,like final variable in java
    val xVal =  "Hi Scala"
    //var can be reassigned,like non-final variable in java
    var xVar = ""
    xVar = "Hello Scala"

    //type inference
    var infVar = 8 //infVar referenced as int type

    //explicitly specifying the type
    var expVar: String = "Scala"

    //defining function in scala
    def greater(x: Int,y: Int): Int = {
      if(x > y) x
      else y
    }

    println(greater(3,5))


    val alphabets = Array("x","y","z")
    //imperative style for loop
    for(i <- 0 to alphabets.length-1){
      println(alphabets(i))
    }
    //funtional style for loop
    alphabets.foreach(str => println(str))//input is a function

    //page 81:Programming in Scala 2nd
  }

}
