package com.scala.study

import org.scalatest.FunSuite

/**
 * Created by Daiki on 2015/09/02.
 */
class ChecksumAccumlatorTest extends FunSuite {

  test("First") {
    val a = new ChecksumAccumlator
    a.add(10)
    assert(a.sum === 10)
    println(a.checksum())

    ChecksumAccumlator.calculate("A")
  }

}
