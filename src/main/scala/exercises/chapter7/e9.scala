package exercises.chapter7

/**
 * Created by michal on 11/11/14.
 */

object MainE9 extends App {

  object authenticator {
    import java.lang.System
    def login():Unit  = {
      val username  = System.getProperty("user.name", "anonymous")
      val password = Console.readLine("Enter password:")
      if (password == "secret") println(s"Greetings: $username")
      else System.err.println("Invalid password!")

    }
  }
  authenticator.login()
}
