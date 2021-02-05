package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 20)
  println(person.greet("Daniel"))
  println(person.greet())


  val counter = new Counter(0)
  counter.inc.print
  counter.inc.inc.inc.dec.print
}

class Person(name: String, val age: Int) {
  val x = 2

  println(1 + 2)

  def greet(name: String) =
    println(s"${this.name} says: Hi $name")

  def greet() = println(s"Hi, I am ${name}")

  def this(name: String) = this(name, 0)

  def this() = this("John")

  new Writer("Lionel", "Messi", 1993)
}

/*
Novel and a Writer

Eriter: firstname surname, year
- method fullname

Novel: name, year of release, author
- authotAge
- isWrittenBy(author)
- copy(new year of release) = new instance of Novel

 */

class Writer(firstName: String, surname: String, val year: Int) {
  def fullName() = s"${firstName} ${firstName}"
}

class Novel(name: String, yearOfRelease: Int, author: Writer) {
  def authorAge() = this.author.year

  def isWrittenBy() = this.author.fullName()

  def copy(newYearOfRelease: Int): Novel = new Novel(name, newYearOfRelease, author)
}

class Counter(val count: Int) {
  def inc = {
    println("incrementing")
    new Counter(count + 1)
  }

  def dec = {
    println("Decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if(n <= 0) this
    else inc.inc(n+1)
  }
  def dec(n: Int): Counter = {
    if(n <= 0) this
    else dec.dec(n-1)
  }

  def print = println(count)
}


/*
  Counter class
  - receives an int value
  - method current count
  - method to increment/decrement => new Counter
  - overload inc/dec to receive an amount
 */
//class parameters are not fields