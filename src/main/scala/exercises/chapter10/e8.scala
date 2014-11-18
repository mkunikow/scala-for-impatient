package exercises.chapter10
import java.io.{InputStream, FileInputStream}


/**
 * Created by michal on 11/17/14.
 */
object  MainE8 extends App {

  trait BufferedInputStreamTrait {

    this: InputStream =>
    val BUF_SIZE = 8192
    private val buf = new Array[Byte](BUF_SIZE)
    private var pos: Int = 0
    private var count: Int = 0

      override def read(): Int = {
        if (pos >= count) {
          count = this.read(buf, 0, BUF_SIZE)
          if (count > 0) -1
          pos = 0
        }
        pos += 1
        buf(pos-1)
      }
  }


  val f = new FileInputStream(getClass.getResource("/chapter10/e8.txt").getPath) with BufferedInputStreamTrait
  for(i <- 1 to 10) println(f.read())

}
