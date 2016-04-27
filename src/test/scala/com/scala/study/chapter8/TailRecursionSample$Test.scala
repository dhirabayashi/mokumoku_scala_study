package com.scala.study.chapter8

import org.scalatest.FunSuite
import com.scala.study.chapter8.TailRecursionSample._

/**
 * Created by Daiki on 2015/12/16.
 */
class TailRecursionSample$Test extends FunSuite {
  test("testFactorial") {
    assert(factorial(0) === 1)
    assert(factorial(1) === 1)
    assert(factorial(2) === 2 * 1)
    assert(factorial(3) === 3 * 2 * 1)
    assert(factorial(4) === 4 * 3 * 2 * 1)
  }

  test("testFactorialMatch") {
    assert(factorialMatch(0) === 1)
    assert(factorialMatch(1) === 1)
    assert(factorialMatch(2) === 2 * 1)
    assert(factorialMatch(3) === 3 * 2 * 1)
    assert(factorialMatch(4) === 4 * 3 * 2 * 1)
  }

  test("testBoomBang") {
    //boom(5)
    //bang(50000)
  }

  test("testFactorialMatchTailRecursion") {
    assert(factorialMatchTailRecursion(0) === 1)
    assert(factorialMatchTailRecursion(1) === 1)
    assert(factorialMatchTailRecursion(2) === 2 * 1)
    assert(factorialMatchTailRecursion(3) === 3 * 2 * 1)
    assert(factorialMatchTailRecursion(4) === 4 * 3 * 2 * 1)
  }

  test("testFibBNoRecursion") {
    assert(fibNoRecursion(0) === 0)
    assert(fibNoRecursion(1) === 1)
    assert(fibNoRecursion(2) === 1)
    assert(fibNoRecursion(3) === 2)
    assert(fibNoRecursion(4) === 3)
    fibNoRecursion(100000)
  }

  test("testFibRecursion") {
    assert(fibRecursion(0) === 0)
    assert(fibRecursion(1) === 1)
    assert(fibRecursion(2) === 1)
    assert(fibRecursion(3) === 2)
    assert(fibRecursion(4) === 3)
    //fibRecursion(100000)
  }

  test("testFibTailRecursion") {
    assert(fibTailRecursion(0) === 0)
    assert(fibTailRecursion(1) === 1)
    assert(fibTailRecursion(2) === 1)
    assert(fibTailRecursion(3) === 2)
    assert(fibTailRecursion(4) === 3)
    fibTailRecursion(100000)
  }
}
