package exercises.chapter15

/**
 * Created by michal on 12/13/14.
 */
class e8 {
  def allDifferent[@specialized T](x: T, y: T, z: T) = x != y && x != z && y != z
//  def allDifferent[T](x: T, y: T, z: T) = x != y && x != z && y != z
}
/*

@specialized

(master)⚡ % javap -c ./target/scala-2.11/classes/exercises/chapter15/e8.class                                                                                                                  ~/Projects/books/scala-for-impatient
Compiled from "e8.scala"
public class exercises.chapter15.e8 {
  public <T> boolean allDifferent(T, T, T);
    Code:
       0: aload_1
       1: aload_2
       2: invokestatic  #16                 // Method scala/runtime/BoxesRunTime.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
       5: ifne          24
       8: aload_1
       9: aload_3
      10: invokestatic  #16                 // Method scala/runtime/BoxesRunTime.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
      13: ifne          24
      16: aload_2
      17: aload_3
      18: invokestatic  #16                 // Method scala/runtime/BoxesRunTime.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
      21: ifeq          28
      24: iconst_0
      25: goto          29
      28: iconst_1
      29: ireturn

  public boolean allDifferent$mZc$sp(boolean, boolean, boolean);
    Code:
       0: iload_1
       1: iload_2
       2: if_icmpeq     19
       5: iload_1
       6: iload_3
       7: if_icmpeq     19
      10: iload_2
      11: iload_3
      12: if_icmpeq     19
      15: iconst_1
      16: goto          20
      19: iconst_0
      20: ireturn

  public boolean allDifferent$mBc$sp(byte, byte, byte);
    Code:
       0: iload_1
       1: iload_2
       2: if_icmpeq     19
       5: iload_1
       6: iload_3
       7: if_icmpeq     19
      10: iload_2
      11: iload_3
      12: if_icmpeq     19
      15: iconst_1
      16: goto          20
      19: iconst_0
      20: ireturn

  public boolean allDifferent$mCc$sp(char, char, char);
    Code:
       0: iload_1
       1: iload_2
       2: if_icmpeq     19
       5: iload_1
       6: iload_3
       7: if_icmpeq     19
      10: iload_2
      11: iload_3
      12: if_icmpeq     19
      15: iconst_1
      16: goto          20
      19: iconst_0
      20: ireturn

  public boolean allDifferent$mDc$sp(double, double, double);
    Code:
       0: dload_1
       1: dload_3
       2: dcmpl
       3: ifeq          24
       6: dload_1
       7: dload         5
       9: dcmpl
      10: ifeq          24
      13: dload_3
      14: dload         5
      16: dcmpl
      17: ifeq          24
      20: iconst_1
      21: goto          25
      24: iconst_0
      25: ireturn

  public boolean allDifferent$mFc$sp(float, float, float);
    Code:
       0: fload_1
       1: fload_2
       2: fcmpl
       3: ifeq          22
       6: fload_1
       7: fload_3
       8: fcmpl
       9: ifeq          22
      12: fload_2
      13: fload_3
      14: fcmpl
      15: ifeq          22
      18: iconst_1
      19: goto          23
      22: iconst_0
      23: ireturn

  public boolean allDifferent$mIc$sp(int, int, int);
    Code:
       0: iload_1
       1: iload_2
       2: if_icmpeq     19
       5: iload_1
       6: iload_3
       7: if_icmpeq     19
      10: iload_2
      11: iload_3
      12: if_icmpeq     19
      15: iconst_1
      16: goto          20
      19: iconst_0
      20: ireturn

  public boolean allDifferent$mJc$sp(long, long, long);
    Code:
       0: lload_1
       1: lload_3
       2: lcmp
       3: ifeq          24
       6: lload_1
       7: lload         5
       9: lcmp
      10: ifeq          24
      13: lload_3
      14: lload         5
      16: lcmp
      17: ifeq          24
      20: iconst_1
      21: goto          25
      24: iconst_0
      25: ireturn

  public boolean allDifferent$mSc$sp(short, short, short);
    Code:
       0: iload_1
       1: iload_2
       2: if_icmpeq     19
       5: iload_1
       6: iload_3
       7: if_icmpeq     19
      10: iload_2
      11: iload_3
      12: if_icmpeq     19
      15: iconst_1
      16: goto          20
      19: iconst_0
      20: ireturn

  public boolean allDifferent$mVc$sp(scala.runtime.BoxedUnit, scala.runtime.BoxedUnit, scala.runtime.BoxedUnit);
    Code:
       0: aload_1
       1: aload_2
       2: astore        4
       4: dup
       5: ifnonnull     17
       8: pop
       9: aload         4
      11: ifnull        75
      14: goto          25
      17: aload         4
      19: invokevirtual #51                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      22: ifne          75
      25: aload_1
      26: aload_3
      27: astore        5
      29: dup
      30: ifnonnull     42
      33: pop
      34: aload         5
      36: ifnull        75
      39: goto          50
      42: aload         5
      44: invokevirtual #51                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      47: ifne          75
      50: aload_2
      51: aload_3
      52: astore        6
      54: dup
      55: ifnonnull     67
      58: pop
      59: aload         6
      61: ifnull        75
      64: goto          79
      67: aload         6
      69: invokevirtual #51                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      72: ifeq          79
      75: iconst_0
      76: goto          80
      79: iconst_1
      80: ireturn

  public exercises.chapter15.e8();
    Code:
       0: aload_0
       1: invokespecial #58                 // Method java/lang/Object."<init>":()V
       4: return
}


no @specialized

(master)⚡ % javap -c ./target/scala-2.11/classes/exercises/chapter15/e8.class                                                                                                                  ~/Projects/books/scala-for-impatient
Compiled from "e8.scala"
public class exercises.chapter15.e8 {
  public <T> boolean allDifferent(T, T, T);
    Code:
       0: aload_1
       1: aload_2
       2: invokestatic  #16                 // Method scala/runtime/BoxesRunTime.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
       5: ifne          24
       8: aload_1
       9: aload_3
      10: invokestatic  #16                 // Method scala/runtime/BoxesRunTime.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
      13: ifne          24
      16: aload_2
      17: aload_3
      18: invokestatic  #16                 // Method scala/runtime/BoxesRunTime.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
      21: ifeq          28
      24: iconst_0
      25: goto          29
      28: iconst_1
      29: ireturn

  public exercises.chapter15.e8();
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: return
}


*/
