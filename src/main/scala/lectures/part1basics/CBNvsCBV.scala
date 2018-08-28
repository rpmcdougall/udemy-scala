package lectures.part1basics

object CBNvsCBV extends App {

//  computed at evaluation
  def calledByValue(x: Long): Unit = {
    println(s"by value: " + x)
    println(s"by value: " + x)
  }

//  computed at runtime, evaluated twice
  def calledByName(x: => Long): Unit = {
    println(s"by name: " + x)
    println(s"by name: " + x)
  }

  calledByName(System.nanoTime())
  calledByValue(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

//  printFirst(infinite(), 34)
printFirst(34, infinite())
}
