/**
 * Created by krishna on 21/10/15.
 */
object euler6 extends App{
  val sumSquares = (1 to 100).foldLeft(0)((a,b) => a+b)
  val sum = (1 to 100).sum
  val squareSum = sum*sum
  val answer =  squareSum - sumSquares
  println(answer)
}
