package exercises.chapter11

/**
 * Created by michal on 11/27/14.
 */
object  MainE9 extends  App {

  object RichFile {
    def unapply(path: String) = {
      val sepPos = path.lastIndexOf('/')
      val dotPos = path.lastIndexOf(".")
      if (sepPos >= 0 && dotPos >= 0) {
        Some((path.substring(0, sepPos), path.substring(sepPos + 1, dotPos), path.substring(dotPos + 1)))
      } else {
        None
      }
    }
  }

  val RichFile(path, name, extension) = "/home/cay/readme.txt"
  println(s"path: $path, name: $name, extension: $extension")

}
