package pl.japila.scalania.s99

object S99_P13 {
  def encodeDirect[T](ts: Seq[T]): Seq[(Int, T)] =
    ts.foldRight(List[(Int, T)]()) {
      //case (t,Nil) => (1,t)::Nil
      case (t, (n, hist) +: tail) if t == hist => (n + 1, t) +: tail
      case (t, folded) => (1, t) +: folded
    }

}
