package com.scala.study.chapter15

import org.scalatest.FunSuite

/**
 * Created by Daiki on 2016/02/03.
 */
class DayOfWeekTest extends FunSuite {
  test("DayOfWeek") {
    val a = Sunday
    assert(Obj.returnInt(a) === 1)

    val b = Friday
    assert(Obj.returnInt(b) === 6)
  }
}
