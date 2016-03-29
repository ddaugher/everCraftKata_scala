class Character(private val _name: String) {

  val name: String = _name
  var alignment: Alignment = Neutral
  var armorClass: Int = 10
  var hitPoints: Int = 5

  def attack(opponent: Character, roll: Int): Attack = {
    if (roll > opponent.hitPoints) return Hit
    Miss
  }
}
