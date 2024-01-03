package Roadmap

object PatternMatching extends App {

  // print kth element

  def kthElement(list: List[Int],k:Int): Boolean={
    list match {
      case Nil=> false
      case head:: _ if (k==head)=> true
      case _ :: tail=> kthElement(tail,k)
      case _ => false
    }
  }
  val list = List(2,4,5,7)
  println(s"${kthElement(list,2)}")
  println(s"${kthElement(list,6)}")


  // add

  def elementsum(list:List[Int],sum:Int):Int ={
    list match {
      case Nil=> sum
      case head::tail=>elementsum(tail,head+sum)
    }
  }

  val list1 = List(5,88,9)
  println(s"${elementsum(list1,0)}")

}
