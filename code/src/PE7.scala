/**
 * Created by krishna on 22/10/15.
 */
object euler7 extends App{
  def isPrime(num : Int)={
    !(2 to num -1).exists(num % _ ==0)
  }

  def isPrime1(num : Int)={
    !(2 to math.sqrt(num).toInt).exists(num % _ ==0)
  }


  println(isPrime(13))
}