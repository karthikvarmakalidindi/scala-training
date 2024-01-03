package Roadmap

object Maps extends App {

  //listmap

  val list = List(23,24,78,69,123,456,12)
  val list2= list.map(element=>element*2)
  println(list2)

  val listofLists= List(List(89,50),List(33,2),List(2,5))

  // listofLists.map

  val l2 = listofLists.map(list=>list.map(element=>element*2))
  println(l2)


  //flatten map

  val listofLists1 = List(List(44,66),List(8,9),List(77,41))
  val l3 = listofLists1.flatten
  println(l3)


  //flatmap


  val l4 = listofLists.flatMap(list=>list.map(element=>element*2))
  println(l4)


  //flatmap using list

  def multiBy2(x:Int):List[Int]=List(x*2)
  val l5 = list.flatMap(multiBy2)
  println(l5)


  // pattern matching


  def multiElementBy4(list:List[Int],acc:List[Int]):List[Int] = {
    list match {
      case Nil => acc
      case head :: tail => multiElementBy4(tail,acc ::: List (head*2))
    }
  }
  println(multiElementBy4(list,List()))

  

}
