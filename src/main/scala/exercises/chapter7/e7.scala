package exercises.chapter7

object MainE7 extends App {

  object CopyHashMapHelper {
    import java.util.{HashMap => JavaHashMap}
    import scala.collection.mutable.{HashMap => ScalaHashMap}

    def copyJavaHashMapToScalaHashMap(javaMap: JavaHashMap[String,Int]): ScalaHashMap[String,Int] = {
      val destination = new ScalaHashMap[String,Int]()
      for (key <- javaMap.keySet.toArray; keyStr = key.toString) destination(keyStr) = javaMap.get(keyStr)
      destination
    }
  }
  import java.util.{HashMap => JavaHashMap}

  val source = new JavaHashMap[String, Int]
  source.put("A", 1)
  source.put("B", 2)
  source.put("C", 3)
  println(CopyHashMapHelper.copyJavaHashMapToScalaHashMap(source))

}
