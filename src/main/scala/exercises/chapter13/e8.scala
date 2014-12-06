package exercises.chapter13

/**
 * Created by michal on 12/6/14.
 */
object e8 extends App {
    def transformTo2dArray(array: Array[Int], size: Int): Array[Array[Int]] = array.grouped(size).toArray
}
