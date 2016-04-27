package com.scala.study.chapter8

import scala.annotation.tailrec

/**
 * Created by Daiki on 2015/12/16.
 */
object TailRecursionSample {
  def factorial(n:Int):Int = {
    if( n <= 1 )
      1
    else
      n * factorial(n - 1)
  }

  def factorialMatch(n:Int):Int = n match {
    case 0 | 1 => 1
    case _ => n * factorialMatch(n - 1)
  }

  def boom(x:Int):Int = {
    if(x == 0) throw new Exception("boom!")
    else boom(x - 1) + 1
  }

  @tailrec
  def bang(x:Int):Int =
    if(x == 0) throw new Exception("bang!")
    else bang(x - 1)

  def factorialMatchTailRecursion(n:Int):Int = {
    @tailrec
    def factorialMatch(n:Int, m:Int):Int = n match {
      case 0 | 1 => m
      case _ => factorialMatch(n - 1, n * m)
    }
    factorialMatch(n, 1)
  }

  def fibNoRecursion(n:Int):Int = {
    var a = 0
    var b = 1
    for(i <- 1 to n) {
      val next = a + b
      a = b
      b = next
    }
    a
  }

  def fibRecursion(n:Int):Int = n match {
    case 0 | 1 => n
    case _ => fibRecursion(n - 1) + fibRecursion(n - 2)
  }

  def fibTailRecursion(n:Int):Int = {
    @tailrec
    def fibTail(n:Int, a:Int, b:Int):Int = n match {
      case 0 => a
      case _ => fibTail(n - 1, b, a + b)
    }
    fibTail(n, 0, 1)
  }
}
