package Roadmap

  object RemoveDuplicates {

    def removeDuplicates(inputList: List[Int]): List[Int] = {
      inputList match {
        case Nil => Nil
        case head :: tail => head :: removeDuplicates(tail.filter(_ != head))
      }
    }

    def main(args: Array[String]): Unit = {
      val inputList = List(1, 2, 3, 4, 4, 5, 2, 1, 2, 3, 6)
      val result = removeDuplicates(inputList)
      println(s"Original List: $inputList")
      println(s"List without duplicates: $result")
    }






  }



