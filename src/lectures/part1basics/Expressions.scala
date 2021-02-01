package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3
  println(aVariable)

  // Instructions(DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionValue = if (aCondition) 5 else 3 // IF expression
  println(aConditionValue)
  println(if (aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN

  // EVERITHING in Scala is an Expression

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  //side effects: println(), whiles, reassigning

  // Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  //1. what is the difference between "hello world" vs println("hello world")
  // hello rowld is a value String
  //println is a sideeffect, type Unit

  //2.
  val someValue = {
    2 > 3
  }
  // some value is a boolean
  println(someValue)

  val someOtherValue = {
    if (someValue) 239 else 985
    42
  }
  println(someOtherValue)
  // someOtherValue is Int
}
