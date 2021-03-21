package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def like(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"${name}, what the hack"
    def unary_+ : Person =  new Person(name, favoriteMovie, age+1)
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is ${name} and I like ticktok"
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"
    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "Scala"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.like("Inception"))
  println(mary.like("Inception"))
  //infix notation = operation notation

  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom)

  println(1 + 2)
  println(1.+(2))
  //ALL OPERATORS ARE METHODS


  val x = -1 // is equivalent with 1.unary_~
  val y = 1.unary_~
  //unary_ prefix only works with - + ~ !

  println(!mary)

  // postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  // apply
  println(mary.apply())
  println(mary())

  println((mary + "the Rockstar")())
  println((+mary).age)
  print(mary learnsScala)
  print(mary(10))
}
