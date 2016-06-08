package com.scala.study.chapter21

import org.scalatest.FunSuite
import com.scala.study.chapter21.Taps.Tap

/**
  * Created by Daiki on 2016/06/01.
  */
class TapsTest extends FunSuite {
  test("testTap") {
    val a = List(-3, -2, -1, 0, 1, 2, 3, 4)
    a.tap(i => println("AAAAA " + i))
      .filter(_ > 0)
      .tap(i => println("BBBBB " + i))
      .filter(_ % 2 == 0)
      .tap(i => println("CCCCC " + i))
  }
}
