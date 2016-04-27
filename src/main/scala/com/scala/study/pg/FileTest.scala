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

  def readLine(path:String, encoding:String = "Windows-31J") : List[String]  = {
    using(Source.fromFile(path, encoding)) {
      s => s.getLines().toList
    }
  }

  def write(lines:List[String], path:String, encoding:String = "Windows-31J") : Unit = {
    using( Files.newBufferedWriter(Paths.get(path), Charset.forName(encoding))) {
      writer => lines.map(_ + "\r\n").foreach(writer.write)
    }
  }

  def using[A <% {def close():Unit}, B](s:A)(f:A => B) : B = {
    try {
      f(s)
    } finally {
      s.close()
    }
  }
}
