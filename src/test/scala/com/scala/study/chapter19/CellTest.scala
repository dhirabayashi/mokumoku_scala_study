package com.scala.study.chapter19

import org.scalatest.FunSuite

/**
 * Created by Daiki on 2016/03/30.
 */
class CellTest extends FunSuite {
  test("Cell") {
    val a = new Cell[String]("A")
    a.put("B")
    assert(a.get() === "B")

    val b = new Cell[Int](1)
    b.put(2)
    assert(b.get() == 2)
  }

  test("Pair") {
    val a = new Pair(1, 100)
    println(a.toString)

    val b = new Pair("A", "B")
    println(b.toString())

    var d: Pair[Any, Any] = new Pair(1, 2)
    d = a
  }
}
