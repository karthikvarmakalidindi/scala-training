package Roadmap

object main {
  def checkNumberInList(list: List[Int], number: Int): Unit = {
    val isPresent = list.contains(number)
    if (isPresent) {
      println(s"The given number $number is true in the list.")
    } else {
      println(s"The given number $number is false, not in the list.")
    }
  }
  val myList = List(137, 287, 32, 49, 55)
  val inputNumber = 3

  checkNumberInList(myList, inputNumber)


  // adding numbers and give total as an output

  def main(args: Array[String]): Unit = {
    val numbers = List(9, 10, 6, 4, 2, 7)
    val result = numbers.sum
    println(s" adding all the given numbers in the list is : $result ")
  }
}
