package lectures.part2oop

object AnonymousClasses extends App {

  abstract class Animal {
    def eat: Unit
  }

  // anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("ahahahahahaha")
  }

  println(funnyAnimal.getClass)


  class Person(name: String) {
    def sayHi: Unit = println(s"Hi, my name is $name, how can I help you?")
  }

  val jim = new Person("jim") {
    override def sayHi: Unit = println(s"Hey, Jim, get out the way")
  }
}
