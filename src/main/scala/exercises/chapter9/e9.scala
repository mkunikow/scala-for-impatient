package exercises.chapter9

import scala.util.matching.Regex

/**
 * Created by michal on 11/13/14.
 */
object MainE9 extends App {
  import java.io.File

  val dir = new File(getClass.getResource("/").getPath)
  val pattern = """.*\.class$""".r

  def subdirFileCount(dir: File, pattern: Regex): Int = {
    val subDirs = dir.listFiles.filter(_.isDirectory)
    val fileNames = dir.listFiles.filter(f => (!f.isDirectory && pattern.findFirstIn(f.getName).isDefined)).map(_.getName)

    fileNames.size + subDirs.map(subdirFileCount(_, pattern)).sum
  }

  println(s"Number of class files in dir $dir is " + subdirFileCount(dir, pattern))

}
