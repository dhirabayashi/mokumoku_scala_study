package com.scala.study.chapter21

/**
  * Created by Daiki on 2016/06/01.
  */
trait Additive[A] {
  def plus(a: A, c : A): A
  def zero : A
}

object Add {

  implicit object StringAdditive extends Additive[String] {
    override def plus(a: String, b: String): String = a + b
    override def zero: String = ""
  }

  implicit object IntAdditive extends Additive[Int] {
    override def plus(a: Int, b: Int): Int = a + b
    override def zero: Int = 0
  }

  def sum[A](list: List[A])(implicit m : Additive[A]) = list.foldLeft(m.zero)((x, y) => m.plus(x, y))
}