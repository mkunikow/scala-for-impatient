package exercises.chapter21

/**
 * Created by michal on 12/28/14.
 */
object e1 extends App {

  val r1 = "Hello" -> 42 //("Hello", 42)
  val r2 = 42 -> "Hello" //(42, "Hello")

//  Implicit Classes http://docs.scala-lang.org/overviews/core/implicit-classes.html
//  "Scala 2.10 introduced a new feature called implicit classes.
//  An implicit class is a class marked with the implicit keyword.
//  This keyword makes the class’ primary constructor available for implicit conversions when the class is in scope."


// Predef.ArrowAssoc
//  .....
//  implicit final class ArrowAssoc[A](private val self: A) extends AnyVal {
//    @inline def -> [B](y: B): Tuple2[A, B] = Tuple2(self, y)
//    def →[B](y: B): Tuple2[A, B] = ->(y)
//  }

// "Hello" -> 42
// String is converted into ArrowAssoc. On ArrowAssoc the "->" method is invoked.
// This method returns tuple.

}
