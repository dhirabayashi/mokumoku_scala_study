package com.scala.study.chapter24

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Random, Success}

/**
  * Created by Daiki on 2016/06/08.
  */
object FutureOptionUsageSample extends App {
  val random = new Random()
  val waitMaxMilliSec = 3000

  val futureMilliSec: Future[Int]  = Future {
    val waitMilliSec = random.nextInt(waitMaxMilliSec)
    if(waitMilliSec < 1000) throw new RuntimeException(s"waitMilliSec is ${waitMilliSec}")
    Thread.sleep(waitMilliSec)
    waitMilliSec
  }

  futureMilliSec.map(_.toDouble / 1000).onComplete {
    case Success(waitSec) => println(s"Success! ${waitSec} sec")
    case Failure(t) => println(s"Failure! ${t.getMessage}")
  }

  Thread.sleep(3000)
}
