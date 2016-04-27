package com.scala.study.chapter12

import org.scalatest.FunSuite

/**
 * Created by Daiki on 2016/01/27.
 */
class IntQueueTest extends FunSuite {
  test("intQueue") {
    val a = new BasicQueue
    a.put(10)
    a.put(20)
    assert(a.get() === 10)
    assert(a.get() === 20)

    val b = new MyQueue
    b.put(10)
    b.put(20)
    assert(b.get() === 20)
    assert(b.get() === 40)

    val c = new BasicQueue with Incrementing with Filtering
    c.put(-1)
    c.put(0)
    c.put(1)
    assert(c.get() === 1)
    assert(c.get() === 2)
  }
}
