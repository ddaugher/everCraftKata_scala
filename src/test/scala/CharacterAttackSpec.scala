import org.scalatest._

class CharacterAttackSpec extends FlatSpec with Matchers {
  "Character" should "Miss when attacking roll is lower than hit points" in {
    val character = new Character("TOM")
    val opponent = new Character("OPPONENT")

    opponent._hitPoints = 15
    val roll: Int = 10

    Miss should === (character.attack(opponent, roll))
  }

  "Character" should "Hit when attacking roll is higher than hit points" in {
    val character = new Character("TOM")
    val opponent = new Character("OPPONENT")

    opponent._hitPoints = 10
    val roll: Int = 15

    Hit should === (character.attack(opponent, roll))
  }

  "Character" should "Hit when attacking roll is equal to hit points" in {
    val character = new Character("TOM")
    val opponent = new Character("OPPONENT")

    opponent._hitPoints = 10
    val roll: Int = 10

    Hit should === (character.attack(opponent, roll))
  }

}
