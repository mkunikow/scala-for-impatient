package exercises.chapter9

import java.io.{FileInputStream, ObjectInputStream, FileOutputStream, ObjectOutputStream}

/**
 * Created by michal on 11/13/14.
 */
object MainE10 extends App {

  class Person(val firstName: String, val lastName: String) extends Serializable {
    private var friends: List[Person] = Nil

    def addFriend(friend: Person) = {friends = friend :: friends; this}
    def getFriends = friends

    override def toString = s"Person($firstName $lastName) friends: $getFriends"
  }

  object Person {
    def apply(firstName: String, lastName: String) = new Person(firstName, lastName)
  }

  val wojtek = Person("Wojtek", "W")
  val adam = Person("Adam", "A")
  val maciek = Person("Maciek", "M")

  wojtek.addFriend(adam).addFriend(maciek)

  println("Input Wojtek: " + wojtek)

  val path = getClass.getResource("/chapter9").getPath + "/person.obj"
  val out = new ObjectOutputStream(new FileOutputStream(path))
  out.writeObject(wojtek)
  out.close()
  val in = new ObjectInputStream(new FileInputStream(path))
  val savedWojtek = in.readObject().asInstanceOf[Person]
  println("Saved Wojtek: " + savedWojtek)

}
