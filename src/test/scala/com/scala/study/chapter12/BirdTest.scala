package com.scala.study.chapter12

import org.scalatest.FunSuite

/**
 * Created by Daiki on 2016/01/27.
 */
class BirdTest extends FunSuite {

  test("Pigeon flyMessage") {
    val pi = new Pigeon
    pi.fly()
    pi.swim()

    println("*********************")

    val h = new Hawk
    h.fly()
    h.swim()

    println("*********************")

    val pe = new Penguin
    pe.swim()

    println("*********************")

    val fr = new FrigateBird
    fr.fly()

    println("*********************")
    val superPe = new Penguin with Flying {
      val flyMessage = "I'M FLYING!!!"
    }
    superPe.fly()
  }

}
