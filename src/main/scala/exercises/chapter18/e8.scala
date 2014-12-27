package exercises.chapter18

/**
 * Created by michal on 12/26/14.
 */
object e8 extends App {
  def printValuesWithStructType(f: {def apply(v: Int): Int}, from: Int, to: Int): Unit = {
    for (i <- from to to) {print(f.apply(i))}
  }

  def printValuesWithFunction1(f: (Int) => Int, from: Int, to: Int): Unit = {
    for (i <- from to to) {print(f.apply(i))}
  }

  printValuesWithStructType((x: Int) => x * x, 3, 6) // Prints 9 16 25 36
  println("")
  printValuesWithStructType(Array(1, 1, 2, 3, 5, 8, 13, 21, 34, 55), 3, 6) // Prints 3 5 8 13
  
  
  println("")
  printValuesWithFunction1((x: Int) => x * x, 3, 6) // Prints 9 16 25 36
  println("")
  printValuesWithFunction1(Array(1, 1, 2, 3, 5, 8, 13, 21, 34, 55), 3, 6) // Prints 3 5 8 13

}
