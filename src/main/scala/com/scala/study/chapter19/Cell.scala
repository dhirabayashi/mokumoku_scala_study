package com.scala.study.chapter19

/**
 * Created by Daiki on 2016/03/30.
 */
class Cell[T](var value : T) {
  def put(newValue : T) : Unit = {
    value = newValue
  }

  def get() : T = value
}

class Pair[+T1, +T2](val t1: T1, val t2: T2) {
  override def toString(): String = "(" + t1 + ", " + t2 + ")"
}