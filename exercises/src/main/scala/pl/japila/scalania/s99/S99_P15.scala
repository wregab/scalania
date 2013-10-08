package pl.japila.scalania.s99

object S99_P15 {
  def duplicateN[T](nr: Int, list: Seq[T]): Seq[T] =
    list flatMap (Seq.fill(nr)(_))
}
