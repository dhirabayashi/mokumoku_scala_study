package com.scala.study.chapter21

import org.scalatest.FunSuite
import com.scala.study.chapter21.Add.{IntAdditive, StringAdditive, sum}

/**
  * Created by Daiki on 2016/06/01.
  */
class AdditiveTest extends FunSuite {

  test("additive") {
    println(sum(List(1, 2, 3)))
    println(sum(List("A", "B", "C")))
  }
}
