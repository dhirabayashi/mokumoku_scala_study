package com.scala.study.chapter8

/**
 * Created by Daiki on 2015/11/11.
 */
object ClosureSample {
  def returnFunc(): Int => Int = {
    (x:Int) => x + 1
  }

  def returnFunc2(): () => Int = {
    () => 1 + 2
  }

  var more = 0

  def f(x:Int): Int = {
    more += x
    more
  }

  def f2() : () => Int = {
    var a = 0
    () => {
      a += 1
      a
    }
  }

  def f3(more:Int) : Int => Int = {
    (x:Int) => {
      x + more
    }
  }
}
