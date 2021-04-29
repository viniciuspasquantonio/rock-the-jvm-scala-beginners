package lectures.part2oop

object Inheritance extends App {

  class Animal {
    val creatureType = "wild"

    final def eat = println("nonon")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch


  // constructors

  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  sealed class Adult(name: String, Age: Int, idCard: String) extends Person(name)


  //overriding
  class Dog(dogType: String) extends Animal {
    override val creatureType = dogType

  }

  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)


  //type substitution (broad: polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat


  //Overriding x overloading

  //super

  //preventing overrides
  //1 - use final
  // 2 use final on the entire class
  //3 seal the class = extended

}
