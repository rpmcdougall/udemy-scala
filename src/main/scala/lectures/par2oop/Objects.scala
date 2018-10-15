package lectures.par2oop

object Objects extends App {

  // Scala does not have class level functionality (no static), use object instead
  // Singlton by default
  //Companions object + class
  object Person {
    //class level fucntionality
    val N_EYES = 2
    def canFly: Boolean = false

    def from(mother: Person, father: Person): Person = new Person("Bobby")

  }
  class Person(val name: String) {
    // instance level functionality
  }

  println(Person.N_EYES)
  println(Person.canFly)

  val john = new Person("john")
  val mary = new Person("mary")
  println(mary == john)

  val bobby = Person.from(mary, john)
  println(bobby)

}
