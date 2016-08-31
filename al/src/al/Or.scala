

case class Or(a: Proposition, b : Proposition) extends Junktor{ 
  
  def eval : Boolean =
    a.eval | b.eval    
}