package assignment15_2
//program to check prices of courses available at Acadgild using match
object Scala_Match 
{
  
  //Method to print prices of 4 courses of Acadgild
  def printCourseDetails(course: String):String=course match
  {
    //Match case condition for the 4 courses of Acadgild
    case "Android"=>"Android Course Price - 12999"
    case "Big Data Development"=>"Big Data Development Course Price - 17999"
    case "Big Data Development"=>"Big Data Development Course Price - 17999"
    case "Spark"=>"Spark Course Price - 19999"
      
    //Match case default condition  
    case _ => "Sorry !, The course " + course + " is not available at Acadgild."  
  }
  
  //Main Method
  def main(args : Array[String]):Unit =
  {
    println("**************************************")
    println()
    println(" ACADGILD COURSES ")
    println()
    println("**************************************")
    println()
    println("Following courses are available right now:\n")
    println("1. Android")
    println("2. Big Data Development")
    println("3. Big Data Development")
    println("4. Spark")
    println("**************************************")
    
    //User input for course name
    println("Enter your choice of course: (Example : Android)")
    var choice = scala.io.StdIn.readLine().toString()
    
    //Get price of course choosed by user
    println("\n" + printCourseDetails(choice))
    
  }
  
}