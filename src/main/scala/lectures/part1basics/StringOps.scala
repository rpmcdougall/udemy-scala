package lectures.part1basics

object StringOps extends App{

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length())

//  Scala specific
  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // S-interpolators
  val name = "Ryan"
  val age = 27
  val greeting = s"Hello, my name is $name and I am $age years old"
  println(greeting)
  val anotherGreeting = s"Hello my name is $name and I will be turning ${age + 1}"
  println(anotherGreeting)

  // F-interpolators

  val speed = 1.2f
  val thing = f"$name can chug $speed%2.2f beers per second"
  println(thing)

  // Raw interpolator, injected variables are escaped

  println(raw"This is a \n newline")


}
