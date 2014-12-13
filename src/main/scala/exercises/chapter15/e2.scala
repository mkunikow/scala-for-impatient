package exercises.chapter15

import com.sun.istack.internal.NotNull

import scala.beans.BeanProperty


/**
 * Created by michal on 12/13/14.
 */
object e2 extends App {

  class User  (@BeanProperty @NotNull val username: String, @BeanProperty val age: Int)  {
    @Deprecated def adulthood = age > 18
    override def toString = s"User($username, $age)"
  }

}
