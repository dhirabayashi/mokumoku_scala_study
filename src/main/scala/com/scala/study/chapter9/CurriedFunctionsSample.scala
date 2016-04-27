package com.scala.study.chapter9

import java.io._

/**
 * Created by Daiki on 2015/11/25.
 */
object CurriedFunctionsSample {

  def plainOldSum(x:Int, y:Int) = x + y

  def curriedSum(x:Int)(y:Int) = x + y

  def filter(xs:List[Int], p:Int => Boolean):List[Int] = {
    if(xs.isEmpty) xs
    else if (p(xs.head)) xs.head :: filter(xs.tail, p)
    else filter(xs.tail, p)
  }

  def modN(n:Int)(x:Int) = x % n == 0

  def modM(m:Int, x:Int) = x % m == 0

  def twice(op:Double => Double, x:Double) = op(op(x))

  def withPrintWriter(file:File, op:PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

  def withCurriedPrintWriter(file:File)(op:PrintWriter => Unit) = {
    withPrintWriter(file, op)
  }
}
