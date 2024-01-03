package Roadmap

object ReversingList extends App {

  def reversingList(list:List[Int]):List[Int]={
    var l =list
    var list1:List[Int]=List()

    while (l.length!= 0) {
      list1=l.head :: list1
      l = l.tail
    }
    list1
  }
  println(reversingList(List(3,4,5,6,7,8,2,3,9,8)))

  // using tail recursion and pattern matching

  def reverse(list: List[Int]):List[Int]={
    def rev(acc:List[Int],list:List[Int]):List[Int]={
      list match{
        case Nil=> acc
        case head::tail => rev(head::acc,tail)
      }
    }
    rev(Nil,list)
  }
  println(reverse(List(2,4,5,7,9)))

  // reversing using tailrecursion and pattern matching

  def reverse1(list: List[Int]):List[Int]= {
    def rev(acc:List[Int],list:List[Int]):List[Int]={
      list match {
        case Nil=>acc
        case head::tail => rev(head::acc,tail)
      }
    }
    rev(Nil,list)
  }
  print(reverse1(List(9,6,8,9,3,0,10)))


}
