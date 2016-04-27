package com.scala.study.chapter10

/**
 * Created by Daiki on 2016/01/13.
 */
class LineElement(s: String) extends ArrayElement(Array(s)) {
  // 実質同じ結果なので本来はオーバーライド不要
  override def height = 1
  override def width = s.length
}
