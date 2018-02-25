package prac

object constructordemo {

  class Person(name: String = "", gender: String = ""){
    def this(nam: String){
      this(nam,"")
      println(this.name)
      println(this.gender)
    }
  }

  def main(args: Array[String]): Unit = {
    val p = new Person("Manish")

  }
}
