package com.scala.study.chapter8

import scala.io.Source

/**
 * Created by Daiki on 2015/10/28.
 */
object FunctionSample {

  def processFile(filename:String, width:Int):Unit = {
    def processLine(line:String) :Unit = {
      if(line.length > width) {
        println(filename + ": " + line)
      }
    }

    val source = Source.fromFile(filename)
    for(line <- source.getLines()) {
      processLine(line)
    }
  }

  val a = (x:Int) => x + 1

  def sum(a:Int, b:Int, c:Int) = a + b + c

  def echo(args:String*) = {
    for (arg <- args) println(arg)
  }

  def speed(distance:Float = 0.5F, time:Float) : Float = distance / time
}
