package com.scala.study.chapter15

import java.io.File

import org.scalatest.FunSuite
import com.scala.study.chapter15.MatchSample._

/**
 * Created by Daiki on 2016/02/03.
 */
class MatchSample$Test extends FunSuite {
  test("wild") {
    assert(wild(10) === 1)
    assert(wild("avc") === 2)
    assert(wild(10.1) === 1)
    assert(wild('a') === 1)
  }

  test("concat") {
    assert(const(5) === "five")
    assert(const(true) === "truth")
    assert(const("Hello") === "hi!")
    assert(const(Nil) === "the empty list")
    assert(const(10) === "something else")
  }

  test("variable") {
    assert(variable(0) === "zero")
    assert(variable(1) === "not zero:1")
  }

  test("seq") {
    val a = List(0, 10, 20)
    val b = List(1, 10, 20)
    val c = List(0, "abc", "def")
    val d = List(0, 1, 2, 3, 4)

    assert(seq(a) === 1)
    assert(seq(b) === 0)
    assert(seq(c) === 1)
    assert(seq(d) === 1)
  }

  test("tuple") {
    val a = (1, "a", 10.5)
    val b = 10
    val c = (1, 2, 3, 4)
    val d = (1, 2, 3)

    assert(tuple(a) === 1)
    assert(tuple(b) === 0)
    assert(tuple(c) === 0)
    assert(tuple(d) === 0)
  }

  test("erasure") {
    val a = Map(1 -> "a")
    assert(erasure(a) === 1)
  }

  test("regex matching") {
    val l = new File(".").listFiles().toList
    // l.foreach(println)
    def recursiveFileList(list: List[File]): List[String] = list match  {
      case h :: tail => {
        if (h.isDirectory) recursiveFileList(h.listFiles().toList) ::: recursiveFileList(tail)
        else h.getAbsolutePath :: recursiveFileList(tail)
      }
      case _ => Nil
    }
    //recursiveFileList(l).foreach(println)

    val a = recursiveFileList(l)
    a.foreach(s => println(regexMatch(s)))
  }
}
