package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println (s"Computing factorial of ${n}, - I need factorial of ${n-1}")
      val result = n * factorial(n-1)
      println(s"Computed factorial of ${n}")
      result
    }

  println(factorial(10)) // Setting too high will result in too high of recursive depth (stack overflow)

  def anotherFactorial(n: BigInt): BigInt = {
    def factHelper(x: BigInt, accumulator: BigInt): BigInt = {
      if(x < 1) accumulator
      else factHelper(x-1, x* accumulator) // Preserves stack frame instead of creating new ones, tail recursion = use recursive call as last expression @tailrec to indicate if needed, tail recursion for loops in fp
    }
    factHelper(n, 1)
  }

  println(anotherFactorial(10)) // factHelper(10,1)  = (9, 10*1)  = factHelper(9, 10* 1) = factHelper( 8, 9 * 10 *1) .... factHelper(2, 3*4*5...10*1) = factHelper(1, 1 * 2 * 3 * 4 *  ... * 10) = accumulator
  println(anotherFactorial(5000))


  // concatenate n times tail recursive


  def aRepeatedFunction(aString: String, n: Int, previous: String ): String = {
    if(n <= 0) previous
    else aRepeatedFunction(aString, n-1, aString + previous)
  }

  println("hello", 3, "")


  //is prime tail recursive

  def isPrime(n: Int): Boolean = {
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean = {
      if(!isStillPrime) false
      if(t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)
    }
    isPrimeTailRec(n/2, true)
  }

  println(isPrime(2003))
  println(isPrime(629))

  //fib tail recursive

  def fn(n: Int): Int = {
    def fiboTailRec(i: Int, last: Int, nextToLast: Int): Int = {
      if( i >= n) last
      else fiboTailRec(i+1, last + nextToLast, last)
    }
    if ( n <= 2) 1
    else fiboTailRec(2, 1, 1)
  }
  println(fn(8))
}
