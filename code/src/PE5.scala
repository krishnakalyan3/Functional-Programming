/**
 * Created by krishna on 12/10/15.
 */
object euler5 extends App{
  def divisibleBy(num :Int) ={
    (1 to 20).forall(num % _ == 0)
  }
  val naturalNums= Iterator.from(1)
  val answer =  naturalNums.find(divisibleBy(_)).get
  println(answer)
}

