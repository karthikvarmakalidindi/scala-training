object Functions extends App {

  //anonymous function

  val sub =(p:Int,q:Int)=> p-q
  println(s"substraction of two numbers is: ${sub(10,3)}")



  //closure function

  val num1:Int= 8
  def sub(a:Int):Int={
    val b:Int=6
    val substraction = num1-a-b
    substraction
  }
  println(s"output of closure function is: ${sub(1)}")

  //nested function


  def sub1(p:Int, q:Int): Int ={
    def nestedfun(r:Int): Int ={
      val sub = p-q-r
      sub
    }

    nestedfun(8)
  }
  println(s"output is ${sub1(10,3)}")


  //pure function

  def pure(a:Int, b:Double):Double ={
    a-b
  }
  println(pure(3,1))
}
