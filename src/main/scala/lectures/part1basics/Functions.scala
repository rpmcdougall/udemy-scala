package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int) = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterLessFunction(): Int = 42
  println(aParameterLessFunction())

  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n-1) // recursive functions instead of loops for FP
  }

  println(aRepeatedFunction("hello", 3))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

//  Grading function, (name, age) => "Hi, my name is $name, and I am $age years old

  def grading(name: String, age: Int) : String = {
    "Hi, my name is " + name + ", and I am " + "$age years old"

  }

//   Factorial function 1 *2 * 3 * .. * n
def factorial(n: Int): Int = {
   if(n <= 0) 1 else n * factorial(n-1)
}

  println(factorial(5))

//   Fibonacci function
//  f(1) = 1  f(2)=1 f(n) = f(n-1) + (f(n-2))


  def fn(n: Int): Int = {
    if( n <= 2) 1
    else fn(n-1) + fn(n-2)
  }
  println(fn(8))
//  test if a number is prime

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if(t <= 1) true
      else n % t  != 0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n/2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37*17))
}
