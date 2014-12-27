package exercises.chapter10

import java.io.{FileInputStream, InputStream}

/**
 * Created by michal on 11/18/14.
 */
object e10 extends App {
  trait IterableInputStream extends InputStream with Iterable[Byte] {

    class InputStreamIterator(inputStream: InputStream) extends Iterator[Byte] {
      def hasNext: Boolean = inputStream.available() > 0
      def next: Byte = inputStream.read().toByte
    }

    def iterator: Iterator[Byte] = new InputStreamIterator(this)
  }

  val f = new FileInputStream(getClass.getResource("/chapter10/e10.txt").getPath) with IterableInputStream

  for(b <- f) println(b.toChar)

}
