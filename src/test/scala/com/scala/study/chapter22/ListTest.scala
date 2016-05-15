package com.scala.study.chapter22

import org.scalatest.FunSuite

/**
 * Created by Daiki on 2016/05/11.
 */
class ListTest extends FunSuite {
  test("list test") {
    val a : List[Any] =List()

    a match {
      case h :: tail => 1
      case _ => Nil
    }
  }
}
