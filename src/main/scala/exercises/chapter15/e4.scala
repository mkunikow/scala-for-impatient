package exercises.chapter15

import scala.annotation.varargs

/**
 * Created by michal on 12/13/14.
 */

class SumForJava {
 @varargs def sum(args: Int*): Int = args.sum //to use Integer... args in java, default Seq[Int]
}

