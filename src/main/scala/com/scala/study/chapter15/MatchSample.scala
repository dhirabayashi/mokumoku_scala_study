package com.scala.study.chapter15

import com.scala.study.Rational

/**
 * Created by Daiki on 2016/02/03.
 */
object MatchSample {
  def wild(x: Any) = x match {
    case s: String => 2
    case _ => 1
  }

  def const(x: Any) = x match {
    case 5 => "five"
    case true => "truth"
    case "Hello" => "hi!"
    case Nil => "the empty list"
    case _ => "something else"
  }

  def variable(x: Any) = x match {
    case 0 => "zero"
    case somethingElse => "not zero:" + somethingElse
  }

  def seq(x: Any) = x match {
    case List(0, _*) => 1
    case _ => 0
  }

  def tuple(x: Any) = x match {
    case (a: Int, b: String, c) => 1
    case _ => 0
  }

  def erasure(x: Any) = x match {
    case m: Map[Int, Int] => m.size
    case _ => false
  }

  val SCALAREGEX = """.*\\(.*)\\(.*scala)$""".r
  val JAVAREGEX = """.*\\(.*)\\(.*java)$""".r
  val CLASSREGEX = """.*\\(.*)\\(.*class)$""".r

  def regexMatch(x: String) = x match {
    case SCALAREGEX(a: String, b: String) => b
    case JAVAREGEX(a: String, b: String) => b
    case CLASSREGEX(a: String, b: String) => b
    case _ => "other"
  }
}
