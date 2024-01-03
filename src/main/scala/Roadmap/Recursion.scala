package Roadmap

object Recursion extends App {

  // Tail recursion using fibanocci


  def fibonacci(n: Int): Unit = {
    def helper(n: Int, a: Int, b: Int): Int = {
      if (n <= 1) {
        a
      }
      else {
        print(s"$a,")
        helper(n - 1, b, a + b)
      }
    }

    helper(n, 0, 1)
  }

  println(fibonacci(8))



  //Recursion means function repeating itself
  // recursive

  def fib(n: Int): Int = {
    if (n <= 1) {
      n
    }
    else {
      fib(n - 1) + fib(n - 2)
    }
  }

  println(fib(6))



  //factorial ex:5 factorial=5*4*3*2*1=120


  def fac(n: Int): Int = {
    if (n <= 1) {
      n
    }
    else {
      n * fac(n - 1)
    }
  }

  println(fac(4))

  //tail recursive


  def fac1(num1: Int): Int = {
    def helper(num1: Int, acc: Int): Int = {

      if (num1 <= 1) {
        acc
      }
      else {
        helper(num1 - 1, acc * num1)
      }
    }

    helper(num1, 1)
  }

  println(fac1(5))




  // list task


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
}



