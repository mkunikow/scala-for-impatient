package exercises.chapter13

/**
 * Created by michal on 12/6/14.
 */
object e9 extends App {
    /*However, concurrently mutating or
     iterating over the collection is not safe and will likely lead to errors in your code.
     */
    val frequencies = new scala.collection.mutable.HashMap[Char, Int] with
        scala.collection.mutable.SynchronizedMap[Char, Int]

    val c = 'c'

    frequencies(c) = frequencies.getOrElse(c, 0) + 1


//  outdated code
//    val frequenciesThreadSafe : scala.collection.mutable.ConcurrentMap[Char, Int] =
//        new java.util.concurrent.ConcurrentHashMap[Char, Int]

}
