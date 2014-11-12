package exercises.Chapter8

/**
 * Created by michal on 11/12/14.
 */

class Foo protected(protected val name: String)

class Foo2(name: String) extends Foo(name) {
  override def toString = s"Foo2(name: $name)" //can access protected method
}

object maine10 extends App{
// new Foo("Foo") -> compilation error can't create from protected constructor
 println(new Foo2("Foo2"))

}
