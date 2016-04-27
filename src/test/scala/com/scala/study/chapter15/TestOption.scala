package com.scala.study.chapter15

import org.scalatest.FunSuite

/**
 * Created by Daiki on 2016/02/24.
 */
class TestOption extends FunSuite {
  test("option") {
    val a: Option[String] =Some("abc")
    assert(a.isEmpty === false)
    assert(a.isDefined === true)
    assert(a.get === "abc")

    val capital = Map("France" -> "Paris", "Japan" -> "Tokyo")
    assert(capital.get("Japan") === Some("Tokyo"))
    assert(capital.get("China") === None)
    assert(capital.getOrElse("China", "Not defined.") === "Not defined.")

    val c: Option[Any] = None
    assert(c.getOrElse("Nothing") === "Nothing")

    val d = a match {
      case Some(e) => e + "***"
      case None => "?"
    }
    assert(d === "abc***")
  }

  test("toInt") {
    assert(Opt.toInt("1") === Some(1))
    assert(Opt.toInt("abc") === None)

    assert(Opt.toInt("10").map(_ * 3) === Some(30))
    assert(Opt.toInt("abc").map(_ * 3) === None)
  }

  test("default value") {
    val a = Opt.toInt("abc")
    val b = a match {
      case Some(s) => s
      case None => 0
    }
    assert(b === 0)

    val c = a.getOrElse(0)
    assert(c === 0)

    val d = a.fold(0)(_ * 1)
    assert(d === 0)
  }

  test("option in option") {
    val v1:Option[Int] = Some(3)
    val v2:Option[Int] = Some(5)
    val v3:Option[Int] = None

    assert(v1.map(l1 => v2.map(l2 => l1 * l2)) === Some(Some(15)))
    assert(v1.map(l1 => v2.map(l2 => l1 * l2)).flatten === Some(15))

    assert(v1.flatMap(l1 => v2.map(l2 => l1 * l2)) === Some(15))
    assert(v1.flatMap(l1 => v3.map(l2 => l1 * l2)) === None)
  }
}
