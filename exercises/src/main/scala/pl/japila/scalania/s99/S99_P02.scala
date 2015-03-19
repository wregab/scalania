package pl.japila.scalania.s99

object S99_P02 {
  def penultimate[T](ts: Seq[T]): Option[T] = {
    ts.takeRight(2) match {
      case h +: t +: Nil => Some(h)
      case _ => None
    }
  }
}
