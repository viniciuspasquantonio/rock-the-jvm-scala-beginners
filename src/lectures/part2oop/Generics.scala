package lectures.part2oop

object Generics extends App {

  class MyList[A] {
    //use type A
  }

  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  //generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]

  // variance problem
  class Animal

  class Cat extends Animal

  class Dog extends Animal

  //1. yes, list[Cat] extends List[Animal] = Covarianca
  class CovariantList[+A]

  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  //2. NO invariance
  class InvariantList[A]

  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  //3. Hell, no! CONTRAVARIANCE
  class Trainer[-A]

  val trainer: Trainer[Cat] = new Trainer[Animal]


  // bounded types
  //  subtypes <:
  //  supertypes :>
  class Cage[A <: Animal](animal: A)

  val cage = new Cage(new Dog)

  /* Dont work because of type
  class Car
  val newCage = new Cage(new Car)
   */
}
