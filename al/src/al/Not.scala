

case class Not(a : Proposition) {
  
  def eval : Boolean =
    !a.eval
}