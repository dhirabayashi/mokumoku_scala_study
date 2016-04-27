package com.scala.study

/**
 * Created by Daiki on 2015/09/16.
 */
class Rational(n:Int, d:Int) extends Ordered[Rational]{

  require(d != 0)
  private val g = gcd(n.abs, d.abs)

  val numer: Int = n / g
  val denom: Int = d / g

  println("Created " + numer + "/" + denom)

  def this(n:Int) = this(n, 1)

  override def toString = numer + "/" + denom

  def +(that:Rational): Rational = {
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
  }

  def +(i:Int):Rational = {
    this.+ (new Rational(i))
  }

  def *(that:Rational):Rational = {
    new Rational(numer * that.numer, denom * that.denom)
  }

  def /(that:Rational):Rational = {
    new Rational(numer * that.denom, denom * that.numer)
  }

  def lessThan(that:Rational) = this.numer * that.denom < that.numer * this.denom

  private def gcd(a:Int, b:Int):Int =
    if (b == 0) a else gcd(b, a % b)

  override def compare(that: Rational): Int =
    (this.numer * that.denom) - (that.numer * this.denom)
}
