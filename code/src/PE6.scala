/**
 * Created by krishna on 21/10/15.
 */
object euler6 extends App{
  val sumSquares = (1 to 100).map(n => n * n).sum
  val sum = (1 to 100).sum
  val squareSum = sum*sum
  val answer =  squareSum - sumSquares
  println(answer)
}
