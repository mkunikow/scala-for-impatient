package exercises.chapter16

import scala.xml.Text


/**
 * Created by michal on 12/14/14.
 */
object e3 extends App {
  val r1 = <li>Fred</li> match { case <li>{Text(t)}</li> => t }
  println(s"r1: $r1") //Fred

//  val r2 = <li>{"Fred"}</li> match { case <li>{Text(t)}</li> => t } //matcher error
//  println(s"r2: $r2")


}
