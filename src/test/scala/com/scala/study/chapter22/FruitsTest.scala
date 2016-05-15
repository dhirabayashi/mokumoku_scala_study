package com.scala.study.chapter22

import org.scalatest.FunSuite

/**
 * Created by Daiki on 2016/05/11.
 */
class FruitsTest extends FunSuite {
  test("fruits") {
    val apples = new Apple() :: Nil
    val fruit : List[Fruits] = new Orange :: apples

    val fruits2 = new Apple :: Nil ::: List(new Orange)
  }
}
