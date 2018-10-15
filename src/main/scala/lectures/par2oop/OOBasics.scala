package lectures.par2oop

object OOBasics extends App{

  val person = new Person("Joe", 27)
  println(person.age)
  person.greet("Ryan")
}


class Person( name: String, val age: Int)  {

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
  def greet(): Unit = println(s"Hi, I am $name")

  //overloading constructors, can use default args to get similar behavior
  def this(name: String) = this(name, 0)

}


class Novel(name: String , release: Int, author: Writer) {

  def authorAge(author: Writer, year: String ): Unit = {
//    println(s"Age of author is: ${year - author.year}")
  }

  def isWrittenBy(author: Writer): Unit = {
    println(s"Novel written by: ${author.fullName()}")
  }

  def copy(year: Int): Novel = {
    val copiedNovel = new Novel(name, year, author)
    copiedNovel
  }

}

class Writer(firstName: String, surname: String, val year: String) {

  def fullName(): String = {
     this.firstName + ' ' + this.surname
  }
}

class Counter(val n: Int) {

  def inc = {
    println("incrementing...")
    new Counter(n + 1) }//immutability

  def dec =
  {println("decrementing...")
  new Counter(n - 1)
  }

//  def inc(count: Int) = new Counter(count + n)
//  def dec(count: Int) = new Counter(count - n)

  def inc(n: Int): Counter = {
    if(n < 0) this
    else inc.inc(n-1)
  }

  def dec(n: Int): Counter = {
    if(n < 0) this
    else dec.dec(n-1)
  }

  def print() = println(n)

}