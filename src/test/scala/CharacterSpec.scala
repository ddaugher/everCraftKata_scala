import org.scalatest._

class CharacterSpec extends FlatSpec with Matchers {
  "Character" should "be created with a name" in {
    val c = new Character("TOM")

    "TOM" should === (c.name)
  }

  "Character" should "default to Neutral" in {
    val c = new Character("TOM")

    Neutral should === (c.alignment)
  }

}
