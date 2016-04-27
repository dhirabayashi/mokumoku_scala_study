package com.scala.study.chapter10

/**
 * Created by Daiki on 2016/01/13.
 */
abstract class Element {
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int = if(height == 0) 0 else contents(0).length

  def above(that: Element): Element =
    new ArrayElement(this.contents ++ that.contents)

  def beside(that: Element): Element = {
//    val contents = new Array[String](this.contents.length)
//    for(i <- 0 until this.contents.length)
//      contents(i) =this. contents(i) + that.contents(i)
    new ArrayElement(
      for(
        (line1, line2) <- this.contents zip that.contents
      ) yield line1 + line2
    )
  }
}
