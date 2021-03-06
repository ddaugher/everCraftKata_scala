import org.scalatest._

class CharacterCanBeDamagedSpec extends FlatSpec with Matchers {
  "Character" should "incur 1 point of damage when hit" in {
    val character = new Character("TOM")
    val opponent = new Character("OPPONENT")

    opponent.hitPoints = 10
    val roll: Int = 15

    character.attack(opponent, roll)

    9 should ===(opponent.hitPoints)
  }

  "Character" should "incur 2 points of damage when a natural 20 is rolled" in {
    val character = new Character("TOM")
    val opponent = new Character("OPPONENT")

    opponent.hitPoints = 10
    val roll: Int = 20

    character.attack(opponent, roll)

    8 should ===(opponent.hitPoints)
  }

  "Character" should "ALIVE when hitPoints greater than 0" in {
    val character = new Character("TOM")
    val opponent = new Character("OPPONENT")

    opponent.hitPoints = 1
    1 should ===(opponent.hitPoints)
    Alive should ===(opponent.status)
  }

  "Character" should "DIE when hitPoints equals zero" in {
    val character = new Character("TOM")
    val opponent = new Character("OPPONENT")

    opponent.hitPoints = 0
    0 should ===(opponent.hitPoints)
    Dead should ===(opponent.status)
  }

  "Character" should "DIE when hitPoints less than 0" in {
    val character = new Character("TOM")
    val opponent = new Character("OPPONENT")

    opponent.hitPoints = -1
    -1 should ===(opponent.hitPoints)
    Dead should ===(opponent.status)
  }
}
