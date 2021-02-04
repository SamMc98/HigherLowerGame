import scala.io.StdIn.readInt
import scala.util.Random

object HigherLowerGame {
  def main(args: Array[String]): Unit = {
    
    var secret: Int = new Random().nextInt(101)
    var count: Int = 0 
    
    println("Guess a number ")
    var guess = readInt()    
    
    while (guess != secret){
      
      if (guess > secret){      
      count = count + 1
      println("Lower")
      guess = readInt()}
      
      else if (guess < secret){
      println("Higher")
      guess = readInt()
      count = count + 1}
    
    }
			  count = count + 1
			  println("Correct! It took you " + count + " guesses")
    
  }
}