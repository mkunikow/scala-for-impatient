package exercises.chapter13

/**
 * Created by michal on 12/6/14.
 */
object e6 extends App {
    val lst = List(1,2,3,4,5,6,7,8,9)
    val r1 = (lst :\ List[Int]())(_ :: _) //fold right
    val r2 = (List[Int]() /:lst)(_ :+ _)  //fold left
    val r3 = (List[Int]() /:lst)((x, y) => y :: x) //fold left with reverse

    println(r1)
    println(r2)
    println(r3)

}
