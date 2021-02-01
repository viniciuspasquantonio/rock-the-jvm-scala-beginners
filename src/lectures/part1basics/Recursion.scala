package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)
      result
    }
  }

  println(factorial(10))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // Tail Recursion = use recursive call as the LAST expression

    factHelper(n, 1)
  }

  println(anotherFactorial(5000))

  /*
  anotherFactorial(10) = factHelper(10,1)
  = factHelper(9,10* 1)
  = factHelper(8,9*10* 1)
  = factHelper(7,8*9*10* 1)
  = ...
  = factHelper(1,1*2*3*4..*7,8*9*10* 1)
  = 1*2*3*4...*7*8*9*10
   */

  println(anotherFactorial(2000))

  // WHEN YOU NEED LOOPS, USE_TAIL_RECURSION

  /*
    1. Concatenate a string n times
    2. IsPrime function tail recursive
    3. Fibonacci function, tail recursive
   */

  @tailrec
  def concatenateTailrec(aString: String, x: Int, accumulator: String): String = {
    if (x <= 0) accumulator
    else concatenateTailrec(aString, x - 1, accumulator)
  }

  println(concatenateTailrec("hello", 10, ""))

  def isPrime(n: Int): Boolean = {
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailRec(n / 2, true)

  }

  println(isPrime(2003))


  def fibonacci(n: Int): Int = {
    @tailrec
    def fibonacciTailrec(i: Int, last: Int, nextLast: Int): Int =
      if (i >= n) last
      else fibonacciTailrec(i + 1, last + nextLast, last)

    if (n <= 2) 1
    else fibonacciTailrec(2, 1, 1)
  }

  println(fibonacci(8))
}
