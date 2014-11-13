import java.util.TimeZone

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.util.Random
import java.awt.datatransfer._
import scala.collection.JavaConversions.asScalaBuffer

//1.a
def fillArrayWithRandomNumbers(arr: Array[Int]):Array[Int] = {
  val random = new Random()
  for (i <- 0 until arr.length) arr(i) = random.nextInt(arr.length)
  arr
}
println(fillArrayWithRandomNumbers(Array(0,0,0,0,0)).toList);
//1.b
def randArray(n:Int):Array[Int] = {
  val random = new Random()
  (for (i <- 0 until n) yield random.nextInt(n)).toArray
}
println(randArray(5).toList)
//2
def swapArrayInPlace(arr: Array[Int]):Array[Int] = {
  for (i <- 0 until(arr.length - 1, 2)) {
    val e = arr(i)
    arr(i) = arr(i+1)
    arr(i+1) = e
  }
  arr
}

println(swapArrayInPlace(Array(1,2,3,4,5)).toList)
println(swapArrayInPlace(Array(1,2,3,4)).toList)
println(swapArrayInPlace(Array(1)).toList)
//3.a
def swapArrayForYield(arr: Array[Int]):Array[Int] = {
  (for (i <- 0 until (arr.length, 2); j <- (i+1) to (i, -1) if (j < arr.length) ) yield arr(j)).toArray
}
println(swapArrayForYield(Array(1,2,3,4,5)).toList)
//3.b
//(for {b <- swapArray2.grouped(2); c <- b.reverse} yield c).toArray
def swapArrayGroupedYield(arr: Array[Int]):Array[Int] = {
  (for {b <- arr.grouped(2); c <- b.reverse} yield c).toArray
}
println(swapArrayGroupedYield(Array(1,2,3,4,5)).toList)

//3.c
//swapArray2.grouped(2).flatMap(_.reverse).toArray
def swapArrayFlatMap(arr: Array[Int]):Array[Int] = {
  arr.grouped(2).flatMap(_.reverse).toArray
}
println(swapArrayFlatMap(Array(1,2,3,4,5)).toList)

//4.a
def posThanNegativeForYield(arr: Array[Int]):Array[Int] = {
 val pos = for(e <- arr if e > 0) yield e
 val negative = for(e <- arr if e <= 0) yield e
 pos ++ negative
}
println(posThanNegativeForYield(Array(0,-1,1,-2,2,-3,3,-4,4,-5,5)).toList)

//4.b
def posThanNegativeFilter(arr: Array[Int]):Array[Int] = {
  arr.filter(_ > 0) ++ arr.filter(_ <= 0)
}
println(posThanNegativeFilter(Array(0,-1,1,-2,2,-3,3,-4,4,-5,5)).toList)
//4.b
def posThanNegativePartition(arr: Array[Int]):Array[Int] = {
  val (listA, listB) = arr.partition(_ > 0)
  listA ++ listB
}
println(posThanNegativePartition(Array(0,-1,1,-2,2,-3,3,-4,4,-5,5)).toList)
//5
def averageArray(arr: Array[Double]): Double = {
  arr.sum / arr.length
}
println(averageArray(Array(1.0, 2.0, 3.0, 4.0, 5.0)))
//6.a
def reverseArr(arr: Array[Int]): Array[Int] = {
  for (i <- 0 until arr.length /2) {
    val e = arr(i)
    arr(i) = arr(arr.length -1 - i)
    arr(arr.length - 1 -i) = e
  }
  arr
}
println(reverseArr(Array(1,2,3,5,4)).toList)
//6.b
def reverseArrBuff(arr: Array[Int]): Array[Int] = {
  val ab = scala.collection.mutable.ArrayBuffer[Int]()
  for ( i <- arr.length - 1 to (0, -1)) ab.append(arr(i))
  ab.toArray
}
println(reverseArrBuff(Array(1,2,3,5,4)).toList)

//6.a
def reverseSortArr(arr: Array[Int]): Array[Int] = {
  arr.sortWith(_>_)
}
println(reverseSortArr(Array(1,2,3,5,4)).toList)
//7
def removeDuplicatesArray(arr: Array[Int]): Array[Int] = {
  arr.distinct
}
println(removeDuplicatesArray(Array(1,1,2,2,3,3)).toList)

//8 delete all < 0 elements except first
def transformArray(a: Array[Int]): Array[Int] = {
  val indexes = for (i <- 0 until a.length if a(i) < 0) yield  i
  val indexesToRemove = indexes.reverse.dropRight(1)
  val ar = a.to[scala.collection.mutable.ArrayBuffer]
  for (i <- indexesToRemove) ar.remove(i)
  ar.toArray
}
println(transformArray(Array(1,-1,-2,-3,4)).toList)

//9.a
def getAllAmericaTimeZonesFilterMap(): Array[String] = {
  TimeZone.getAvailableIDs().filter(_.startsWith("America")).map(_.replace("America/", ""))
}
println(getAllAmericaTimeZonesFilterMap().toList);

//9.b
def getAllAmericaTimeZonesForYield(): Array[String] = {
  for (timezone <- TimeZone.getAvailableIDs() if timezone.startsWith("America")) yield timezone.replace("America/", "")
}
println(getAllAmericaTimeZonesForYield().toList);

//10
def getNativesForFlavor():mutable.Buffer[String] = {
  val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
  val buffer: mutable.Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
  return buffer

}
println(getNativesForFlavor())


