package exercises.chapter15
import scala.io.Source

/**
 * Created by michal on 12/13/14.
 */

object  FileUtilityForJava {
  def getFileLines(fileName: String) = Source.fromFile(fileName).mkString
}
