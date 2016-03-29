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

  "Character" must "allow the alignment to be set after creation" in {
    val c = new Character("TOM")

    c.alignment = Good
    Good should ===(c.alignment)
  }

  "Character" should "have a default armor class value of 10" in {
    val c = new Character("TOM")

    10 should ===(c.armorClass)
  }
}
