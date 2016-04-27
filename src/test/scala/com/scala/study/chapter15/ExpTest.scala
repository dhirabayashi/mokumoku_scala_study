package com.scala.study.chapter15

import org.scalatest.FunSuite

/**
 * Created by Daiki on 2016/02/03.
 */
class ExpTest extends FunSuite {
  test("Exp") {
    val example = Add(Lit(1), Div(Mul(Lit(2), Lit(3)), Lit(2)))

    assert(Obj2.eval(example) === 4)
  }
}
