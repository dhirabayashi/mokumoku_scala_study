package com.scala.study.chapter15

import org.scalatest.FunSuite

/**
 * Created by Daiki on 2016/03/09.
 */
class TestEither extends FunSuite {
  test("either") {
    val v1: Either[String, Int] = Right(123)
    val v2: Either[String, Int] = Left("abc")

    v1 match {
      case Right(r) => println(r)
      case Left(l) => println(l)
    }
  }

  test("LoginService") {
    LoginService.login("notExistsUser", "pass") match {
      case Right(u) => println(s"id: ${u.id}")
      case Left(InvalidPassword) => println("Invalid pass.")
      case Left(UserNotFound) => println("User not found.")
      case Left(PasswordLocked) => println("Password locked.")
    }
  }

  val a = LoginService.login("userA", "pass")
  assert(a.right.map(u => u.id) === Right(1L))

  val b = LoginService.login("notExistsUser", "pass")
  assert(b.right.map(u => u.id) === Left(UserNotFound))
}
