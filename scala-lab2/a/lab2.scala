
import scala.beans.BeanProperty

class Person(val givenName : String, @BeanProperty var surname : String, val id : String) {
    def name = {
        givenName.toString + " " + surname.toString
    }
}
object Appl extends App {
  val p = new Person("Jan", "Kowalski", "1234567890")
  println(p.name)
  println(p.getSurname())
}