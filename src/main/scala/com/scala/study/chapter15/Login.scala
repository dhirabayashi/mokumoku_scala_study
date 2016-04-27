package com.scala.study.chapter15

sealed trait LoginError
case object InvalidPassword extends LoginError
case object UserNotFound extends LoginError
case object PasswordLocked extends  LoginError

case class User(id: Long, name: String, password: String)

object LoginService {

  val userDatabase: Map[String, User] = Map(
    "userA" -> User(1L, "userA", "pass"),
    "userB" -> User(1L, "userB", "pass"),
    "userC" -> User(1L, "userC", "pass")
  )

  def login(name: String, password: String): Either[LoginError, User] =  {
    userDatabase.get(name) match {
      case Some(u) => Right(u)
      case None => Left(UserNotFound)
    }
  }
}