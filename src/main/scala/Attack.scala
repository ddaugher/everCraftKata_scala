sealed trait Attack {
  def value: String
}

final case object Miss extends Attack {
  val value = "Miss"
}

final case object Hit extends Attack {
  val value = "Hit"
}
