package com.scala.study.chapter11

import org.scalatest.FunSuite

/**
 * Created by Daiki on 2016/01/20.
 */
class ClassHierarchyTest extends FunSuite {
  test("hierarchy") {
    assert(1 === 1)

    val a: Int = 10

    val b: Byte = 10

    assert(10.toString === "10")
    assert(10.hashCode === 10)
    assert(10.equals(10))

    val c = 42 max 43
    assert(c === 43)

    val d = 42 min 43
    assert(d === 42)

    val e = 1 until 5
    assert(e === Range(1, 5))
    e.foreach(println)

    val f = (-3).abs
    assert(f === 3)
  }

  test("isEqual") {
    assert(isEqual(421, 421) === true)
    val x = "abcd".substring(0, 2)
    val y = "abcd".substring(0, 2)
    println(x)
    println(y)
    assert(isEqual(x, y) === true)
  }

  test("divide") {
    val a = divide(1, 2)
    intercept[RuntimeException] {
      val b = divide(2, 0)
    }

    //val b: Byte = null
  }

  def isEqual(x: java.lang.Integer, y: java.lang.Integer): Boolean = x == y

  def isEqual(x: String, y: String): Boolean = x == y

  def divide(x: Int, y: Int): Int =
    if (y != 0) x / y else error("can't divide by zero.")
}
