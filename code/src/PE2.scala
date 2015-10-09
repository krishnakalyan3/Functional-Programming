/**
 * Created by krishna on 08/10/15.
 * Project Euler 2 : Fibonacci using scala
 */
object euler2 extends App{
  def fib(x : Int, y: Int) : Stream[Int] = {
    x #:: fib(y, x + y)
  }

  val ans = fib(1,2).takeWhile(n => n <= 4000000).filter(n => n % 2 == 0).sum
  println(ans)
}