package lectures.part2oop

;

object AbstractDataTypes extends App {

  //abstract class
  abstract class Animal {
    val creatureType: String

    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    override val eat: Unit = println("crunch crunch")
  }

  //traits
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore {
    override val creatureType: String = "croc"

    override def eat: Unit = println("nononon")

    override def eat(animal: Animal): Unit = print(s"I am a coc and  I am eating ${animal.creatureType}")

  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  //traits vs abstract classes


  // Abstract classes can have both abstract and non abstract members
  // 1- Traits do not have constructor parameters
  // 2 - multiple traits may be nherited by the same class
  // 3 - Traits = behavior
}
