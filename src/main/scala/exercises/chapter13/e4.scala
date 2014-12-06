package exercises.chapter13

/**
 * Created by michal on 12/5/14.
 */
object e4 extends App {
    def mapStringToInt(words: Array[String], dict: Map[String, Int]): Array[Int] =
        for (word <- words; if (dict.contains(word))) yield dict(word)


    def mapStringToIntFlatMap(words: Array[String], dict: Map[String, Int]): Array[Int] =
        words.flatMap(dict.get(_))

}
