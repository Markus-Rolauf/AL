

case class And(a: Proposition, b : Proposition) extends Junktor {
 
  def eval : Boolean =
    a.eval & b.eval           
}