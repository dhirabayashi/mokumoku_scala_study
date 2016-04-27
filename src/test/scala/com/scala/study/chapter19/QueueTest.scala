package com.scala.study.chapter19

import org.scalatest.FunSuite

/**
 * Created by Daiki on 2016/03/30.
 */
class QueueTest extends FunSuite {
  test("SlowAppendQueue") {
    var a = new SlowAppendQueue[Int](Nil)
    a = a.enqueue(1)
    a = a.enqueue(10)
    a = a.enqueue(100)
    assert(a.head === 1)
    assert(a.tail.head === 10)
    assert(a.tail.tail.head === 100)
  }

  test("SlowHeadQueue") {
    var a = new SlowHeadQueue[String](Nil)
    a = a.enqueue("A")
    a = a.enqueue("B")
    a = a.enqueue("C")

    assert(a.head === "A")
    assert(a.tail.head === "B")
    assert(a.tail.tail.head === "C")
  }

  test("Queue") {
    var a = Queue(0)

    a = a.enqueue(1)
    a = a.enqueue(10)
    a = a.enqueue(100)
    assert(a.head === 0)
    assert(a.tail.head === 1)
    assert(a.tail.tail.head === 10)
    assert(a.tail.tail.tail.head === 100)

    //    var a = new Queue[Int](Nil, Nil)
//    a = a.enqueue(1)
//    a = a.enqueue(10)
//    a = a.enqueue(100)

//    assert(a.head === 1)
//    assert(a.tail.head === 10)
//    assert(a.tail.tail.head === 100)
  }

//  test("Queue2") {
//    val a = Queue(0)
//    a.enqueue()
//  }
}
