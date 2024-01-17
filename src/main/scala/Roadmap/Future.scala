package Roadmap

import scala.concurrent.{Future, Await}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object FutureListExample extends App {

  val inputList: List[Future[Int]] = List(Future(1), Future(2), Future(2))

  val resultFuture: Future[List[Int]] = Future.sequence(inputList).map(_.sum)

  val result: List[Int] = Await.result(resultFuture, 3.seconds)

  println(result)




}
