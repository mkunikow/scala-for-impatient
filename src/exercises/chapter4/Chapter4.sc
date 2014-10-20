import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.mutable

val wordsPath = "/home/michal/Projects/books/scala-for-impatient/resources/chapter4/words.txt"
//1.a
def getGizmosPrizesDiscountMap(m: Map[String, Double]): Map[String, Double] = {
  m.map{case (key, value) => (key, 0.9 * value)}
}
println(getGizmosPrizesDiscountMap(Map("gizmo1" -> 10, "gizmo2" -> 20)))
//1.b
def getGizmosPrizesDiscountForYield(m: Map[String, Double]): Map[String, Double] = {
  for ((key, value) <- m) yield (key, 0.9 * value)
}
println(getGizmosPrizesDiscountForYield(Map("gizmo1" -> 10, "gizmo2" -> 20)))
//2
def countWordsInFileMutableMap(path:String): Map[String, Int] = {

  val in = new java.util.Scanner(new java.io.File(path))
  val words = scala.collection.mutable.Map[String, Int]()

  while (in.hasNext()) {
    val word = in.next()
    words(word) = words.getOrElse(word, 0) + 1
  }

  words.toMap
}

println(countWordsInFileMutableMap(wordsPath))
//3
def countWordsInFileImmutableMap(path:String): Map[String, Int] = {
  val in = new java.util.Scanner(new java.io.File(path))
  var words = Map[String, Int]().withDefault(_ => 0)
  while (in.hasNext()) {
    val word = in.next()
    val count = words(word)
    words = words - word + (word -> (count + 1))
  }

  words
}
println(countWordsInFileImmutableMap(wordsPath))
//4
def countWordsInFileImmutableSortedMap(path:String): Map[String, Int] = {
  val in = new java.util.Scanner(new java.io.File(path))
  var words = scala.collection.immutable.SortedMap[String, Int]().withDefault(_ => 0)
  while (in.hasNext()) {
    val word = in.next()
    val count = words(word)
    words = words - word + (word -> (count + 1))
  }

  words
}
println(countWordsInFileImmutableSortedMap(wordsPath))

//5
def countWordsInFileMutableJavaTreeMap(path:String): Map[String, Int] = {
  val in = new java.util.Scanner(new java.io.File(path))
  val words: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]
  while (in.hasNext()) {
    val word = in.next()
    words(word) = words.getOrElse(word, 0) + 1
  }

  words.toMap
}
println(countWordsInFileMutableJavaTreeMap(wordsPath))

//6
def getJavaCalendarDays(): Map[String, Int] = {
  import java.util.Calendar._
  mutable.LinkedHashMap[String, Int](
    "Monday" -> MONDAY,
    "Tuesday" -> TUESDAY,
    "Wednesday" -> WEDNESDAY,
    "Thursday" -> THURSDAY,
    "Friday" -> FRIDAY,
    "Saturday" -> SATURDAY,
    "Sunday" -> SUNDAY
  ).toMap
}

println(getJavaCalendarDays())

//7
def getJavaSystemProperties(): List[String] = {
  import scala.collection.JavaConversions.propertiesAsScalaMap
  val props: scala.collection.Map[String, String] = System.getProperties()
  val maxKey = props.keys.maxBy(s => s.length).length
  (for ((key, value) <- props) yield (key.padTo(maxKey, " ").mkString + "| " + value)).toList

}
println(getJavaSystemProperties().mkString("\n"))

//8
def minmax(arr: Array[Int]): (Int, Int) = (arr.min, arr.max)

println(minmax(Array(1,2,3,4,5)))

//9
def lteqgt(values: Array[Int], v: Int): (Int, Int, Int) =
  (values.count(_ < v), values.count(_ == v), values.count(_ > v))
println(lteqgt(Array(1,2,3,3,3,4,5), 3))

//10
"Hello".zip("World")

