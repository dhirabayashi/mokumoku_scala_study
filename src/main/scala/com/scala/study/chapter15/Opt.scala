package com.scala.study.chapter15

/**
 * Created by Daiki on 2016/03/09.
 */
object Opt {

  def toInt(s: String): Option[Integer] = {
    try {
      Some(Integer.valueOf(s))
    } catch {
      case e: NumberFormatException => None
    }
  }
}
