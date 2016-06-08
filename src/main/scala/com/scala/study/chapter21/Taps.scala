package com.scala.study.chapter21

/**
  * Created by Daiki on 2016/06/01.
  */
object Taps {
  implicit class Tap[T](self : T) {
    def tap[U](block : T => U) : T = {
      block(self)
      self
    }
  }
}
