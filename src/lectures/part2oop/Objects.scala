package lectures.part2oop

object Objects {

  //STATIC DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("STATIC")

  object Person { // type + its only instance
    // static class level
    val N_EYES = 2
    def canFly: Boolean = false

    def from(mother: Person, father: Person): Person = new Person("bobby")
  }

  class Person(val name: String) {
    // instance-level functionality
  }

  // Person are COMPANIONS

  println(Person.N_EYES)
  println(Person.canFly)


  def main(args: Array[String]): Unit = {

  }

  // Scala object = SINGLETON INSTANCE
  val mary = new Person("mary")
  val john = new Person("john")
  println(mary == john)

  val person1 = Person
  val person2 = Person
  println(person1 == person2)

  val bobbie = Person.from(mary, john)


  //Scala Application = Scala object with
  //def main(args: Array[String]): Unit
}
