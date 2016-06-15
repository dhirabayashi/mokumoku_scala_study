package com.scala.study.chapter24

import scala.concurrent.{Future, Promise}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Random, Success}

/**
  * Created by Daiki on 2016/06/08.
  */
object PromiseSample extends App {
  //val random = new Random()
  val promiseGetInt : Promise[Int] = Promise[Int]

  val futureGetInt : Future[Int] = promiseGetInt.success(1).future

  futureGetInt.onComplete {
    case Success(i) => println(s"Success! i:${i}")
    case Failure(t) => println(s"Failure! ${t.getMessage}")
  }

  Thread.sleep(5000)
}
