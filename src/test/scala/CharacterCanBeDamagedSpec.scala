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


//  If attack is successful, other character takes 1 point of damage when hit
//  If a roll is a natural 20 then a critical hit is dealt and the damage is doubled
//    when hit points are 0 or less, the character is dead
}
