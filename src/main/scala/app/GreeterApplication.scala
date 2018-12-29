package app

import scala.io.StdIn

object GreeterApplication extends App {

  def greet(name: String) : Unit = {
    if (name == "adam"){
      println(s"You don't get a hello!")
    } else {
      println(s"Hello $name")
    }
  }

  val name = StdIn.readLine("What is your name? ")
  greet(name)
}
