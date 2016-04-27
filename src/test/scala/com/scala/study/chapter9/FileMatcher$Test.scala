package com.scala.study.chapter9

import org.scalatest.FunSuite

/**
 * Created by Daiki on 2015/11/11.
 */
class FileMatcher$Test extends FunSuite {
  test("filesEnding") {
    val fileList = FileMatcher.fileEnding("lnk")
    fileList.foreach(println)
  }

  test("filesContains") {
    val fileList = FileMatcher.filesContains("a")
    fileList.foreach(println)
  }

  test("filesRegex") {
    val fileList = FileMatcher.filesRegex(".*\\.txt")
    fileList.foreach(println)
  }
}
