package com.scala.study.chapter21

import org.scalatest.FunSuite
import com.scala.study.chapter21.StringObj.enrichString

/**
  * Created by Daiki on 2016/06/01.
  */
class ImplicitSampleTest extends FunSuite {

  implicit def intToBoolean(arg : Int) : Boolean = arg != 0

  test("implicit conversion") {
    if(1) {
      println("AAA")
    }
  }

  test("enrichString") {
    println("HI".smile)
  }

  test("scala standard") {
    val a : Int = -10
    a.abs

    val b = Map(1 -> "A", 2 -> "B")
  }
}
