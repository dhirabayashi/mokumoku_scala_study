package com.scala.study.chapter8

import org.scalatest.FunSuite

/**
 * Created by Daiki on 2015/11/11.
 */
class ClosureSample$Test extends FunSuite {
  test("returnFunc") {
    val a = ClosureSample.returnFunc()
    assert(a(1) === 2)
    assert(a(2) === 3)

    val b = ClosureSample.returnFunc2()
    assert(b() === 3)
  }

  test("f") {
    assert(ClosureSample.f(1) === 1)
    assert(ClosureSample.f(1) === 2)
  }

  test("f2") {
    val a = ClosureSample.f2()
    assert(a() === 1)
    assert(a() === 2)
    assert(a() === 3)
  }

  test("f3") {
    val a = ClosureSample.f3(1)
    assert(a(1) === 2)
    assert(a(2) === 3)

    val b = ClosureSample.f3(100)
    assert(b(1) === 101)
    assert(b(2) === 102)
  }
}
