package exercises.chapter17

/**
 * Created by michal on 12/20/14.
 */
object e4 extends App {
  class Pair[T](val first: T, val second: T) {
    def replaceFirst[R >: T](newFirst: R) = new Pair[R](newFirst, second)
    def replaceFirst2(newFirst: T) = new Pair[T](newFirst, second)
  }

  class Person
  class Student extends Person

  val p1 = new Person
  val p2 = new Person
  val s1 = new Student
  val s2 = new Student

  val pair = new Pair(s1, s2)
  pair.replaceFirst(p1)
//  pair.replaceFirst2(p1) // => error person is not a student

  val pair2 = new Pair(p1,p2)
  pair2.replaceFirst2(s1) // => Student <: Person
  
  



}
