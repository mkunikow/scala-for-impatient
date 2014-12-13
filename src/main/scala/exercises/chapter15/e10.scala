package exercises.chapter15

import scala.annotation.tailrec

/**
 * Created by michal on 12/13/14.
 */
class e10 extends App {
      def factorial(n: Int): Int = {
        assert(n > -1)
        @tailrec def factorialAcc(acc: Int, n: Int): Int = {
          if (n <= 1) acc
          else factorialAcc(n * acc, n - 1)
        }
        factorialAcc(1, n)
      }
}
/*
(master)⚡ % javap -c ./target/scala-2.11/classes/exercises/chapter15/e10.class                                                                                                                 ~/Projects/books/scala-for-impatient
Compiled from "e10.scala"
public class exercises.chapter15.e10 implements scala.App {
  public long executionStart();
    Code:
       0: aload_0
       1: getfield      #20                 // Field executionStart:J
       4: lreturn

  public java.lang.String[] scala$App$$_args();
    Code:
       0: aload_0
       1: getfield      #25                 // Field scala$App$$_args:[Ljava/lang/String;
       4: areturn

  public void scala$App$$_args_$eq(java.lang.String[]);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #25                 // Field scala$App$$_args:[Ljava/lang/String;
       5: return

  public scala.collection.mutable.ListBuffer<scala.Function0<scala.runtime.BoxedUnit>> scala$App$$initCode();
    Code:
       0: aload_0
       1: getfield      #31                 // Field scala$App$$initCode:Lscala/collection/mutable/ListBuffer;
       4: areturn

  public void scala$App$_setter_$executionStart_$eq(long);
    Code:
       0: aload_0
       1: lload_1
       2: putfield      #20                 // Field executionStart:J
       5: return

  public void scala$App$_setter_$scala$App$$initCode_$eq(scala.collection.mutable.ListBuffer);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #31                 // Field scala$App$$initCode:Lscala/collection/mutable/ListBuffer;
       5: return

  public java.lang.String[] args();
    Code:
       0: aload_0
       1: invokestatic  #41                 // Method scala/App$class.args:(Lscala/App;)[Ljava/lang/String;
       4: areturn

  public void delayedInit(scala.Function0<scala.runtime.BoxedUnit>);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #46                 // Method scala/App$class.delayedInit:(Lscala/App;Lscala/Function0;)V
       5: return

  public void main(java.lang.String[]);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #52                 // Method scala/App$class.main:(Lscala/App;[Ljava/lang/String;)V
       5: return

  public int factorial(int);
    Code:
       0: getstatic     #60                 // Field scala/Predef$.MODULE$:Lscala/Predef$;
       3: iload_1
       4: iconst_m1
       5: if_icmple     12
       8: iconst_1
       9: goto          13
      12: iconst_0
      13: invokevirtual #64                 // Method scala/Predef$.assert:(Z)V
      16: aload_0
      17: iconst_1
      18: iload_1
      19: invokespecial #68                 // Method factorialAcc$1:(II)I
      22: ireturn

  public exercises.chapter15.e10();
    Code:
       0: aload_0
       1: invokespecial #75                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: invokestatic  #79                 // Method scala/App$class.$init$:(Lscala/App;)V
       8: return
}

*/

