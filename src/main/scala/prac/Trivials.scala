package prac

class Trivials(s:String){
  private val x = 0
  private val y = 2
}

object Trivials {
  private val y = 1
  def main(args: Array[String]): Unit = {
    var Trivials = new Trivials("Trivials")
    println(Trivials.x)
    println(Trivials.y)
  }
}
