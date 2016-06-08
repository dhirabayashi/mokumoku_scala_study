package com.scala.study.chapter21

class RichString(val src : String) {
  def smile : String = src + ":-)"
}

/**
  * Created by Daiki on 2016/06/01.
  */
object StringObj {
  implicit def enrichString(arg : String) : RichString = new RichString(arg)
}
