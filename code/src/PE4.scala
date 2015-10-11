/**
 * Created by krishna on 11/10/15.
 */
object eluer4 extends App{
  def isPalindrome(num : Int) ={
    val numString = num.toString()
    numString == numString.reverse
  }
  val palindromes = for(x <- 100 to 999; y <- 100 to 999 if isPalindrome(x*y)) yield x*y
  println(palindromes.max)
}

