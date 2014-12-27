package exercises.chapter18

/**
 * Created by michal on 12/26/14.
 * Example from https://github.com/calinburloiu/Scala-for-the-Impatient--Exercises/blob/master/src/exercises/c18_advanced_types/Exer10.scala
 */
object e10 extends App {
  class C {
    println("Init C")

    def f {
      println("C.f")
    }
}

  class D extends C {
    println("Init D")
  }

  trait X1 {
    this: C =>
    println("Init X1")

    override def f {
      println("X1.f")
    }
  }

  trait X2 extends C {
    println("Init X2")

    override def f {
      super.f
      println("X2.f")
    }
  }

  trait X31 extends C with X1 {
    println("Init X31")

    override def f {
      super.f
      println("X31.f")
    }
  }

  trait X32 extends X2 {
    println("Init X32")

    override def f {
      super.f
      println("X32.f")
    }
  }

  //constructions: C >> D >> X1 >> X31 >> (anonymous class)
  //Lin(anonymous class) = X31 >> X1 >> D >> C
  (new D with X31).f

//  Init C
//  Init D
//  Init X1
//  Init X31

//  X1.f
//  X31.f

  println
  //constructions: C >> D >> X2 >> X32 >> (anonymous class)
  //Lin(anonymous class) = X32 >> X2 >> D >> C
  (new D with X32).f
  println

//  Init C
//  Init D
//  Init X2
//  Init X32

//  C.f
//  X2.f
//  X32.f

}
