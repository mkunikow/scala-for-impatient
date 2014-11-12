package exercises.Chapter8

/**
 * Created by michal on 11/12/14.
 */


class Person(val name: String) {
  override def toString = getClass.getName + "[name=" + name + "]"
}

class SecretAgent(codename: String) extends Person(codename) {
  override val name = "secret" // Don't want to reveal name...
  override val toString = "secret" //... or class name
}

object maine8 extends App{
  println(new SecretAgent("James Bond"))
}

/*
Answer: One field name "name" and one getter "name()"

javap -c -private SecretAgent.class                                                                                                                                                                      master [22ee3d7]untracked
Compiled from "e8.scala"
public class exercises.Chapter8.SecretAgent extends exercises.Chapter8.Person {
  private final java.lang.String name;

  private final java.lang.String toString;

  public java.lang.String name();
    Code:
       0: aload_0
       1: getfield      #14                 // Field name:Ljava/lang/String;
       4: areturn

  public java.lang.String toString();
    Code:
       0: aload_0
       1: getfield      #18                 // Field toString:Ljava/lang/String;
       4: areturn

  public exercises.Chapter8.SecretAgent(java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #22                 // Method exercises/Chapter8/Person."<init>":(Ljava/lang/String;)V
       5: aload_0
       6: ldc           #24                 // String secret
       8: putfield      #14                 // Field name:Ljava/lang/String;
      11: aload_0
      12: ldc           #24                 // String secret
      14: putfield      #18                 // Field toString:Ljava/lang/String;
      17: return
}
 */
