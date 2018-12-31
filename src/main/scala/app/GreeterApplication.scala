package app

import scala.io.StdIn

object Prompt {
  def ask(message: String) = StdIn.readLine(message)
}

class Person(val name: String) {
  def speak() : String = {
    if (name == "adam") {
      s"You don't get a hello!"
    }
    else {
      s"Hello $name"
    }
  }
}

object GreeterApplication extends App {
  val name = Prompt.ask("What is your name? ")
  val person = new Person(name)
  println(person.speak())
}
