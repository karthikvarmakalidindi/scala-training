package Roadmap

object Fibonacci extends App {

  // fibonacci in this we are doing the programm which is the adding of last two numbers will give the final results//


  def fib(n: Int): Int = {
    def helper(n: Int, sec: Int, third: Int): Int= {
      n match {
        case 0 => 0
        case 1 => sec
        case _ => helper(n-1, third, sec+third)
      }
    }
    helper(n, 0, 1)
  }

  println(fib(5))



  // tables

  def tables(n:Int): Unit = {

    for(i<-1 to 10){

      println(s"$n$i=${n*i}")


    }
  }
  tables(33)




  //if-else

  val x=18

  if(x > 7) {
    println("x is greater than 7")
  }
  else{
    println("x is not greater than 7")
  }

  val y=9

  if (y>12){
    println("y is greater than 12 ")
  }
  else if(y>7){
    println("y is  greater than 7 but not greater than 12 ")
  }
  else{
    println("y is 7 or below")
  }



  //even or odd


  val num = 10

  def evenOdd(num: Int) = {
    if (num % 2 == 0){
      println("given number is even")
    }else{
      println("given number is odd")
    }
  }
  println(s"${evenOdd(3)}")



  //Nested if else function


  def nested(num:Int) = {

    if (num % 5 == 0){
      if (num == 50){
        println("given number is 50 ")
      }else{
        println(s"given number is $num")
      }
      println("given number is even")
    }else{
      if (num==25){
        println(s"given number is 25")
      }else{
        println(s"given number is $num")
      }
      println("given number is odd")
    }
  }
  println(nested(8))



  //mod and divisible


  println(s"%output => ${20%5}")//result is reminder
  println(s"/output => ${20/4}")//result is quotient


  //ledger


  def ledger(num:Int): Unit = {
    if (num%7==0){
      print("given number is divisible by 7")
    }else if(num%13==0){
      println("given number is divisible by 13")
    }else if(num%9==0){
      println("given number is divisible by 9")
    }else{
      println("given number is not divisible by 7,13,9")
    }
  }
  println(ledger(50))

}
