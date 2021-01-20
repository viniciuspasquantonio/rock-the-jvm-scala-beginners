package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x = 42
  println(x)


  //VALS ARE IMMUTABLE

  //Compiler can infer types

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = true
  val aInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 46131341341l
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  //variables
  var aVariable: Int = 4
  aVariable = 5
}
