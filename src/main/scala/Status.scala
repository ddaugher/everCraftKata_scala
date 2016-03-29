sealed trait Status {
  def value: String
}

final case object Alive extends Status {
  val value = "Alive"
}

final case object Dead extends Status {
  val value = "Dead"
}
