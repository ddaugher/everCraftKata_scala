import org.scalatest._

class CharacterAttackSpec extends FlatSpec with Matchers {
  "Character" should "MISS when attacking" in {
    val character = new Character("TOM")
    val opponent = new Character("OPPONENT")

    opponent.hitPoints = 15
    val roll: Int = 10

    Miss should === (character.attack(opponent, roll))
  }
}
