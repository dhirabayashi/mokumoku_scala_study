package com.scala.study.chapter7

import com.scala.study.chapter7.BuiltinControlStructure
import org.scalatest.FunSuite

/**
 * Created by Daiki on 2015/10/14.
 */
class BuiltinControlStructure$Test extends FunSuite {

  test("if式は値を返す") {
    assert(BuiltinControlStructure.ifFormula(10) === 10)
    assert(BuiltinControlStructure.ifFormula(4) === 0)
  }

  test("while式は値を返さない") {
    assert(BuiltinControlStructure.whileFormula(10).isInstanceOf[Unit])
  }

  test("for yield式は値を返す") {
    val l = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val result:List[Int] = BuiltinControlStructure.forYieldFormula(l)
    assert(result.size === 7)
    //result.foreach(println)
  }

  test("入れ子のfor") {
    val result = BuiltinControlStructure.forNestFormula(2, 2)
    assert(result.size === 9)
    //result.foreach( t => println("x = " + t._1 + " y = " + t._2))
  }

  test("奇数を渡したら例外を返す") {
    assert(BuiltinControlStructure.throwExcetpion(2) === 2)
    intercept[RuntimeException] {
      BuiltinControlStructure.throwExcetpion(1)
    }
  }

  test("キャッチした例外型に応じた戻り値を返す") {
    assert(BuiltinControlStructure.tryCatchFormula === 0)
  }

  test("match式は値を返す") {
    assert(BuiltinControlStructure.matchFormula("A") === 0)
    assert(BuiltinControlStructure.matchFormula("B") === 1)
    assert(BuiltinControlStructure.matchFormula("C") === 2)
    assert(BuiltinControlStructure.matchFormula("D") === 3)
  }
}
