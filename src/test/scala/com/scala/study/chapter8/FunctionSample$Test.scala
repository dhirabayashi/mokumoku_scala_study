package com.scala.study.chapter8

import org.scalatest.FunSuite

/**
 * Created by Daiki on 2015/10/28.
 */
class FunctionSample$Test extends FunSuite {

  test("processFile") {
    FunctionSample.processFile("C:\\Users\\Daiki\\Desktop\\test.txt", 1000)
  }

  test("function literals") {
    val increase = (x:Int) => x + 1
    assert(increase(1) === 2)

    val increase2 = (x:Int) => {
      println("We")
      println("are")
      println("here!")
      x + 1
    }
    assert(increase2(10) === 11)
  }

  test("list method") {
    val someNumbers = List(-11, -10, -5, 0, 5, 10)
    someNumbers.foreach(println)

    val filteredNumbers = someNumbers.filter(_ > 0)
    assert(filteredNumbers.size === 2)

    //assert(someNumbers === filteredNumbers)
  }

  test("place holder") {
    val f = (_:Int) + (_:Int)
    assert(f(1, 2) === 3)

    val f2 = (x:Int, y:Int) => x + y
    assert(f2(1, 2) === 3)
  }

  test("sum") {
    assert(FunctionSample.sum(1, 2, 3) === 6)

    val a = FunctionSample.sum _
    assert(a(1, 1, 2) === 4)

    val b = FunctionSample.sum(1, _:Int, 3)
    assert(b(2) === 6)
  }

  test("echo") {
    FunctionSample.echo("a", "b", "c")
    FunctionSample.echo("z")
  }

  test("speed") {
    assert(FunctionSample.speed(1F, 2F) === 0.5F)
    assert(FunctionSample.speed(time = 2F, distance = 1F) === 0.5F)
    assert(FunctionSample.speed(time = 2F) === 0.25F)
  }

  test("list method with place holder") {
    val list = List(1, 2, 3)
    assert(list.map(_ + 1) === List(2, 3, 4))

    val words = List("the", "quick")
    assert((words map (_.length)) === List(3, 5))
    assert(words.map(_.length).filter(_ > 4) === List(5))

    assert(words.map(_.toList) === List(List('t', 'h', 'e'), List('q', 'u', 'i', 'c', 'k')))

    assert(words.flatMap(_.toList) === List('t', 'h', 'e', 'q', 'u', 'i', 'c', 'k'))

    val list2 = List(1, 2, 3, 4, 5)
    assert(list2.filter( _ % 2 == 0) === List(2, 4))
    assert(list2.partition( _ % 2 == 0) === (List(2, 4), List(1, 3, 5)))

    assert(list2.find( _ % 2 == 0) === Some(2))
    assert(list2.find( _ < 0) === None)

  }
}
