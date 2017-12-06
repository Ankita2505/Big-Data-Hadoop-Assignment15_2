package assignment15_2
//program to find sum and square of numbers using partial function

object Scala_Partial_Func 
{
  //Method origSumFunc() performs sum of three numbers
  private def origSumFunc(a:Int, b:Int, c:Int) = a + b + c

  //Method modSumFunc calls method 'origSumFunc and provide one argument as constant (First value)
  private def modSumFunc = origSumFunc(1, _:Int , _:Int)

  //Method sqrFunc takes Method SumFunc as argument
  def sqrFunc (SumFunc :(Int) => Int):Unit=
  {
    //method call to SumFunc and provides another argument (Third value)
    val sum = SumFunc(4) //Result of Sum
    
    //Perform square on the result of SumFunc
    val square:Int=sum * sum //Result of Square
    
    //Displaying Result of sum and square
    println(s"\n The sum of the numbers in the partial function ModSumFunc is $sum ")
    println(s"\n The square of the sum of the numbers in the partial function ModSumFunc is $square  \n ")
  }
  //Main Method
  def main(args:Array[String]):Unit =
  {
    println("*********************************************")
    println()
    println("----------Partial Function Demo-------------")
    println()
    
    //Function call to method sqrFunc that takes method modSumFunc as argument
    //modSumFunc is call with an argument passed (Second value)
    sqrFunc(modSumFunc(2,_))
    println("*********************************************")
  }
}