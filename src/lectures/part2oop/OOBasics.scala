package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 20)
  println(person.greet("Daniel"))
  println(person.greet())
}

class Person(name: String, val age: Int) {
  val x = 2

  println(1 + 2)

  def greet(name: String) =
    println(s"${this.name} says: Hi $name")

  def greet() = println(s"Hi, I am ${name}")

  def this(name:String) = this(name,0)
  def this() = this("John")
}

//class parameters are not fields