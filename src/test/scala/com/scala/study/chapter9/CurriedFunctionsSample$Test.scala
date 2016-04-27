package com.scala.study.chapter9

import java.io.File
import java.util.Date

import org.scalatest.FunSuite
import com.scala.study.chapter9.CurriedFunctionsSample._

/**
 * Created by Daiki on 2015/11/25.
 */
class CurriedFunctionsSample$Test extends FunSuite {

  test("plainOldSum") {
    assert(plainOldSum(1, 1) === 2)
    assert(plainOldSum(1, 2) === 3)

    val f = plainOldSum(_:Int, 1)
    assert(f(1) === 2)
    assert(f(2) === 3)
  }

  test("curriedSum") {
    assert(curriedSum(1)(1) === 2)
    assert(curriedSum(1)(2) === 3)

    val f = curriedSum(5)_
    assert(f(1) === 6)
    assert(f(2) === 7)

    val f2 = curriedSum(10)_
    assert(f2(2) === 12)
    assert(f2(1) === 11)
  }

  test("filter and modN") {
    val l = List(1,2,3,4,5,6,7,8)

    filter(l, modN(2)).foreach(println)
    println("*****")
    filter(l, modN(3)).foreach(println)
  }

  test("filter and modM") {
    val l = List(1,2,3,4,5,6,7,8)

    filter(l, modM(2, _:Int)).foreach(println)
    println("----")
    filter(l, modM(3, _:Int)).foreach(println)
  }

  test("twice") {
    assert(twice(_ + 1, 5) === 7)
  }

  test("withPrintWriter") {
    withPrintWriter(new File("C:/pg/result.txt"), _.println(new Date))
  }

  test("withCurriedPrintWriter") {
    val file = new File("C:/pg/result2.txt")
    withCurriedPrintWriter(file) {
      _.println(new Date)
    }
  }
}
