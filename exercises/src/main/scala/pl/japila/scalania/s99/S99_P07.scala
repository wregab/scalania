package pl.japila.scalania.s99

object S99_P07 {
  def flatten(ls: Seq[Any]): Seq[Any] = {
    ls.foldRight(Seq[Any]())((any, b) => any match{
      case seq : Seq[Any] =>  flatten(seq)++b
      case _ => any +: b
    })
  }
}
