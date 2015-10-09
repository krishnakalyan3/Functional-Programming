/**
 * Created by krishna on 09/10/15.
 * to print shortcut is fn + shift + f10
 * Indent properly : CMD + Alt + L
 */

object euler3 extends App {
  def factors(num: Long): List[Long] = {
    val exists = (2L to math.sqrt(num).toLong).find(num % _ == 0)
    exists match {
      case Some(d) => d :: factors(num/d)
      case None => List(num)
    }
  }
  println(factors(13195).max)
}