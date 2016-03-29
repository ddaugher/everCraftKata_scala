sealed trait Alignment {
  def value: String
}

final case object Good extends Alignment {
  val value = "Good"
}

final case object Bad extends Alignment {
  val value = "Bad"
}

final case object Neutral extends Alignment {
  val value = "Neutral"
}