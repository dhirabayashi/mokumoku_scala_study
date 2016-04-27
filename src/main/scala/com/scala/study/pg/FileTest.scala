package com.scala.study.pg

import java.nio.charset.Charset
import java.nio.file.{Paths, Files}

import scala.io.Source

/**
 * Created by Daiki on 2015/10/21.
 */
object FileTest {
  def main(args:Array[String]) = {
    val list = readLine("C:/Users/daiki/Desktop/test.txt")
    println(list.mkString("\r\n"))

    write(list, "C:/Users/daiki/Desktop/result.txt")
  }

  def readLine(path:String, encoding:String = "Windows-31J")  = {
    val source = Source.fromFile(path, encoding)
    val list = source.getLines().toList
    source.close
    list
  }

  def write(lines:List[String], path:String, encoding:String = "Windows-31J") = {
    val writer = Files.newBufferedWriter(Paths.get(path), Charset.forName(encoding))
    lines.map(_ + "\r\n").foreach(writer.write)

    writer.close()
  }

  def using[A <% {def close():Unit}](s:A, f:A => Any):Any = {
    var v:Any = null
    try {
      v = f(s)
    } finally {
      s.close()
    }
    v
  }
}
