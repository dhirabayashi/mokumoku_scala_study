package com.scala.study.chapter12

/**
 * Created by Daiki on 2016/01/27.
 */
abstract class Bird

trait Flying {
  def flyMessage: String
  def fly() = println(flyMessage)
}

trait Swimming {
  def swim() = println("I'm swimming.")
}

class Pigeon extends Bird with Swimming with Flying {
  val flyMessage = "I'm a good flyer"
}

class Hawk extends Bird with Swimming with Flying {
  val flyMessage = "I'm an excellent flyer"
}

class Penguin extends Bird with Swimming

class FrigateBird extends Bird with Flying {
  val flyMessage = "I'm an excellent flyer"
}