package com.scala.study.chapter12

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Daiki on 2016/01/27.
 */
abstract class IntQueue {
  def get(): Int
  def put(x: Int)
}

trait Doubling extends IntQueue {
  abstract override def put(x: Int) { super.put(2 * x) }
}

trait Incrementing extends IntQueue {
  abstract override def put(x: Int) { super.put(x + 1) }
}

trait Filtering extends IntQueue {
  abstract override def put(x: Int) { if (x >= 0) super.put(x) }
}

class BasicQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]

  override def get() = buf.remove(0)

  override def put(x: Int) { buf += x }
}

class MyQueue extends BasicQueue with Doubling