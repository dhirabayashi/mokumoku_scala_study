package com.scala.study

import org.scalatest.FunSuite

/**
 * Created by Daiki on 2015/09/16.
 */
class RationalTest extends FunSuite {
  test("Create") {
    val s = new Rational(1, 2)
    assert(s.toString === "1/2")
  }


  test("divide by zero throw IllegalArgumentException") {
    intercept[IllegalArgumentException] {
      new Rational(2, 0)
    }
  }

  test("add rational return rational") {
    val a = new Rational(1, 2)
    val b = new Rational(1, 3)
    val result = a + b
    assert(result.toString === "5/6")
  }

  test("a less than b return true") {
    val a = new Rational(1, 3)
    val b = new Rational(1, 2)
    val result = a lessThan b
    assert(result)
  }

  test("Integer") {
    val a = new Rational(2)
    assert(a.toString === "2/1")
  }

  test("分子/分母が約分される") {
    val a = new Rational(4, 8)
    assert(a.toString === "1/2")
    assert(a.numer === 1)
    assert(a.denom === 2)
  }

  test("Int型を足す") {
    val a = new Rational(1, 2)
    val result = a + 2
    assert(result.toString === "5/2")
  }

  test("* で掛け算を実行する") {
    val a = new Rational(1, 2)
    val b = new Rational(2, 3)
    val result = a * b
    assert(result.toString === "1/3")
  }

  test(" / で割り算を実行する") {
    val a = new Rational(1, 2)
    val b = new Rational(2, 3)
    val result = a / b
    assert(result.toString === "3/4")
  }

  implicit def intToRational(x:Int):Rational = new Rational(x)

  test("暗黙の型変換を実行する") {
    val a = new Rational(1, 2)
    val result = 1 + a
    assert(result.toString === "3/2")
  }

  //test("gcd") {
  //  val a = new Rational(1, 2)
    //val result = a.gcd(15, 20)
    //assert(result === 5)
  //}

  test("compare") {
    val a = new Rational(1, 2)
    val b = new Rational(1, 3)
    val c = new Rational(2, 4)
    val result = a > b
    val result2 = a > c
    val result3 = a >= b

    assert(result === true)
    assert(result2 === false)
    assert(result3 === true)
  }
}
