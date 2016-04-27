package com.scala.study

import scala.collection.mutable.Map

/**
 * Created by Daiki on 2015/09/02.
 */
class ChecksumAccumlator {
  var sum = 0
  def add(b:Byte) { sum += b }
  def checksum():Int = ~( sum & 0xFF ) + 1
}

object ChecksumAccumlator {
  private val cache = Map[String, Int]()

  def calculate(s:String): Int = {
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumlator
      for(c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cs
    }
  }

}