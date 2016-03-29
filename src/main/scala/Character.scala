class Character(private val _name: String) {

  val name: String = _name
  var alignment: Alignment = Neutral
  var armorClass: Int = 10
  var hitPoints: Int = 5

  def attack(opponent: Character, roll: Int): Attack = {

    if (roll == 20) {
      opponent.hitPoints -= 2
      return Hit
    }
    if (roll >= opponent.hitPoints) {
      opponent.hitPoints -= 1
      return Hit
    }
    Miss
  }

  def status: Status = {
    if (hitPoints <= 0) return Dead
    Alive
  }
}
