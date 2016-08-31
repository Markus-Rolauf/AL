

case class Implication (a: Proposition, b : Proposition) {
  def eval : Boolean =
    !a.eval | b.eval
}