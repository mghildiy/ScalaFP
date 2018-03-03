package prac.collections

object ListDemo {

  def main(args: Array[String]): Unit = {
    val oneTwoThree = List(1,2,3)//List.apply(1,2,3)
    val fourFive = List(4,5)//List.apply(4,5)

    val oneToFive = oneTwoThree:::fourFive //fourFive.:::(oneTwoThree)
    println(oneToFive)

    val sevenToTen = List(7,8,9,10)
    val sixToTen = 6::sevenToTen //sevenToTen.::(6)
    println(sixToTen)

    val elevenToFiveteen = 11::12::13::14::15::Nil // Nil is empty list
    println(Nil)
    println(elevenToFiveteen)

    val fruits = List("Mango","Apple","Grapes");
    println(fruits)
    println(fruits.head)//Mango
    println(fruits.tail)// List("Apple","Grapes")

    val veggies = List("Potato","Brinjal","Jackfruit")

    val conc = fruits:::veggies
    println(conc)//List("Mango","Apple","Grapes","Potato","Brinjal","Jackfruit")
    println(conc.head)//Mango
    println(conc.tail)//List(Apple, Grapes, Potato, Brinjal, Jackfruit)

    val grains = List("Wheat","Rice","Millet")
    val cons = fruits::veggies::grains
    println(cons)//List(List(Mango, Apple, Grapes), List(Potato, Brinjal, Jackfruit), Wheat, Rice, Millet)
    println(cons.head)//List(Mango, Apple, Grapes)
    println(cons.tail)//List(List(Potato, Brinjal, Jackfruit), Wheat, Rice, Millet)
    println(cons.init)//List(List(Mango, Apple, Grapes), List(Potato, Brinjal, Jackfruit), Wheat, Rice)

    val years = List(1221,1857)
    println(fruits:::years)//List[Any]

    val randType = List("Apple",24)
    println(randType)
  }

}
