package com.scala.study.chapter10

import org.scalatest.FunSuite

/**
 * Created by Daiki on 2016/01/13.
 */
class ElementTest extends FunSuite {
  test("element") {
    val a = new ArrayElement(Array("hello", "world"))
    assert(a.height === 2)
    assert(a.width === 5)
    assert(a.contents.length === 2)

    val b = new ArrayElement(Array("A", "B"))
    assert(a.above(b).height === 4)
    assert(a.above(b).contents.length === 4)

    val c = new ArrayElement(Array("C", "D"))
    assert(b.beside(c).contents(0) === "AC")
    assert(b.beside(c).contents(1) === "BD")
  }

  test("LineElement") {
    val a = new LineElement("abcdef")
    assert(a.height === 1)
    assert(a.width === 6)

    val b = new LineElement("ghijk")
    assert(a.above(b).height === 2)
    assert(a.above(b).width === 6)
  }

  test("UniformElement") {
    val a = new UniformElement('a', 1, 1)
    assert(a.contents === Array("a"))

    val b = new UniformElement('b', 5, 1)
    assert(b.contents === Array("bbbbb"))
  }

  test("zip") {
    val a = Array("A", "B", "C")
    val b = Array("X", "Y", "Z")
    val c = a zip b
    println(c(0))
  }
}
