object Q4_isEvenOdd extends App {
  def isEven(y:Int):Boolean = y match{
    case 0 => true
    case _  => isOdd(y-1)
  }

  def isOdd(x:Int):Boolean = !isEven(x)

  println(isEven(8))
  println(isOdd(5))

}
