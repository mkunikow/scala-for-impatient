package exercises.Chapter7

/**
 * Created by michal on 11/11/14.
 */
object authenticator {
  import java.lang.System
  def login():Unit  = {
    val username  = System.getProperty("user.name", "anonymous")
    val password = Console.readLine("Enter password:")
    if (password == "secret") println(s"Greetings: $username")
    else System.err.println("Invalid password!")

  }
}

object e9main extends App {
  authenticator.login()
}
