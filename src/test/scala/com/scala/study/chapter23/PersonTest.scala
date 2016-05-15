package com.scala.study.chapter23

import org.scalatest.FunSuite

/**
 * Created by Daiki on 2016/05/11.
 */
class PersonTest extends FunSuite {
  test("for") {
    val lara = Person("Lara", false)
    val bob = Person("Bob", true)
    val julia = Person("Julia", false, lara, bob)
    val persons = List(lara, bob, julia)

    val a = persons filter(p => !p.isMale) flatMap(p => p.children map(c => (p.name, c.name)))
    a.foreach(println)

    val b = for(p <- persons; if !p.isMale; c <- p.children) yield (p.name, c.name)
    assert(a === b)
  }
}
