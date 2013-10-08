package pl.japila.scalania.s99

object S99_P14 {
  def duplicate[T](as: Seq[T]): Seq[T] = as flatMap (Seq.fill(2)(_))
}
