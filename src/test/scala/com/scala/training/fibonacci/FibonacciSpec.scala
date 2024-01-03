package com.scala.training.fibonacci


import Roadmap.Fibonacci
import org.scalatest.funsuite.AnyFunSuite

class FibonacciSpec extends AnyFunSuite {

  test ("my fiboannci method work fine"){
    assert(Fibonacci.fib(8)  === 13)
  }
}