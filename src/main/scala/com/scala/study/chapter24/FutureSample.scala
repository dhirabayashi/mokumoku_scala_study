package com.scala.study.chapter24

import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object FutureSample extends App {
  val s = "Hello"
  val f: Future[String] = Future {
    Thread.sleep(1000)
    println(s"[ThreadName] In Future: ${Thread.currentThread().getName}")
    s + " future!"
  }

  f.onSuccess {
    case s: String =>  {
      println(s"[ThreadName] In Success: ${Thread.currentThread().getName}")
      println(s)
    }
  }

  println(f.isCompleted)

  //Thread.sleep(5000)

  Await.ready(f, 5000 millisecond)
  println(s"[ThreadName] In App: ${Thread.currentThread().getName}")

  println(f.isCompleted)

  Thread.sleep(3000)
}
