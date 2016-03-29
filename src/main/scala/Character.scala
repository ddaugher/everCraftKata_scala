class Character(private val _name: String) {

  val name: String = _name
  var alignment: Alignment = Neutral
  var armorClass: Int = 10
  var _hitPoints: Int = 5

  def attack(opponent: Character, roll: Int): Attack = {

    if (roll == 20) {
      opponent._hitPoints -= 2
      return Hit
    }
    if (roll >= opponent._hitPoints) {
      opponent._hitPoints -= 1
      return Hit
    }
    Miss
  }

  def status: Status = {
    if (_hitPoints == 0) return Dead
    Alive
  }

  def hitPoints(points: Int): Int = {
    if (points < 0) {
      _hitPoints = 0
    } else {
      _hitPoints = points
    }
    _hitPoints
  }
}
