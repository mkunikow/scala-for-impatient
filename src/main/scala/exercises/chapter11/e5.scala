package exercises.chapter11

/**
 * Created by michal on 11/23/14.
 */

object MainE5 extends App {
  class Table(table: Array[Array[String]] = Array(Array())) {


    def |(td: String) = {
      val ab = table.toBuffer
      ab(ab.length - 1) = ab(ab.length - 1) :+ td
      Table(ab.toArray)
    }

    def ||(td: String) = {
      val ab = table.toBuffer
      ab += Array(td)
      Table(ab.toArray)
    }

    override def toString =  {
      val htmlTable = new StringBuilder
      htmlTable ++= "<table>"
      for (tr <- table) {
        htmlTable ++= "<tr>"
        for (td <- tr) {
          htmlTable ++= s"<td>$td</td>"
        }
        htmlTable ++= "</tr>"
      }
      htmlTable ++= "</table>"
      htmlTable.toString()
    }
  }

  object Table {
    def apply(table: Array[Array[String]] = Array(Array())) = new Table(table)
  }

  println(Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET")
}
