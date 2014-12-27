package exercises.chapter18

/**
 * Created by michal on 12/24/14.
 */
object e3 extends App {

  object Title
  object Author

  class Document(private var title: String = "undefined", private var author: String = "undefined") {
    private var useNextArgAs: Any = null
    def setTitle(title: String): this.type = {this.title = title; this }
    def setAuthor(author: String): this.type = {this.author = author; this }

    def set(obj: Title.type): this.type = { useNextArgAs = obj; this }
    def set(obj: Author.type): this.type = { useNextArgAs = obj; this }
    def to(arg: String): this.type = {
      useNextArgAs match {
        case Title => title = arg
        case Author => author = arg
      }
      this
    }

    override def equals(o: Any) = o match {
      case that: Document => that.title == this.title && that.author == this.author
      case _ => false
    }

    override def hashCode = title.hashCode + author.hashCode
    override def toString = s"Doc(title: $title, author: $author)"
  }
}
