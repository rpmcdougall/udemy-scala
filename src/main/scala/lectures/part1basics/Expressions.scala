package lectures.part1basics

object Expressions extends App{

  val x = 1 + 2 // Expression
  println(x)
  println(2 + 3 * 4)
//   + - * / & | ^ << >> >>> (right shift with zero extension

  println(1 == x)

//  == != > >= <=

  println(!(1 == x))

//  ! && ||

  var aVariable = 2
  aVariable += 3 // -== *= /=
  println(aVariable)

//  Instructions(Do) vs Expressions(Value and/or Type)

//  IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3  // if expression vs instruction
  println(aConditionedValue)

//  Avoid while for FP
  var i = 0
  while(i < 10) {
    println(i)
    i += 1
  }
// Everything in scala is an expression
  val aWeirdValue = (aVariable = 3) // Unit == void
  println(aWeirdValue)

//  Side effects return unit
//  Side effect ex: println, while, reassigning , returns unit

//  Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y+1

    if(z > 2) "hello" else "goodbye" // value is last expression
  }


}
