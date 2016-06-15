package com.scala.study.chapter24

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Random, Success}

/**
  * Created by Daiki on 2016/06/08.
  */
object CompositeFutureSample extends App {
  val random = new Random()
  val waitMaxMilliSec = 3000

  def waitRandom(futureName: String): Int = {
    val waitMilliSec = random.nextInt(waitMaxMilliSec)
    if(waitMilliSec < 500) throw new RuntimeException(s"${futureName} waitMilliSec is ${waitMilliSec}")
    Thread.sleep(waitMilliSec)
    waitMilliSec
  }

  val futureFirst : Future[Int] = Future { waitRandom("first") }
  val futureSecond : Future[Int] = Future { waitRandom("second") }

  val compositeFuture : Future[(Int, Int)] =
    for {
      first : Int <- futureFirst
      second : Int <- futureSecond
    } yield (first, second)

  compositeFuture onComplete {
    case Success((first, second)) => println(s"Success! first:${first} second:${second}")
    case Failure(t) => println(s"Failure! ${t.getMessage}")
  }

  Thread.sleep(5000)
}
