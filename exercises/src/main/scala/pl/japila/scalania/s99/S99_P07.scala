package pl.japila.scalania.s99

object S99_P07 {
  def flatten(ls: Seq[Any]): Seq[Any] = ls.flatMap {
    case x: Seq[Any] => flatten(x)
    case x => Seq(x)
  }
}