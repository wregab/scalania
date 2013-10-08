package pl.japila.scalania.s99

object S99_P04 {
  def length[T](ts: Seq[T]): Int = ts match {
    case Nil => 0
    case _ :: tail => 1 + length(tail)
  }
}
