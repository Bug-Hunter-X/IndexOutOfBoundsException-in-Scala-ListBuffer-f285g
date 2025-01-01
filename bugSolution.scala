```scala
import scala.collection.mutable.ListBuffer

object Main extends App {
  val list = new ListBuffer[Int]()
  list += 1
  list += 2
  list += 3

  // Safe way to access elements
  println(list.lift(3).getOrElse(-1)) //Prints -1 because index 3 is out of bounds. 
  println(list.getOrElse(2,-1))//Prints 3 
  if (list.size > 3) {
    println(list(3))
  } else {
    println("Index out of bounds")
  }
}
```