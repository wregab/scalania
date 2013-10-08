package pl.japila.scalania.s99

object S99_P12 {
  def decode[T](its: Seq[(Int, T)]): Seq[T] =
    its flatMap { case (n, t) => List.fill(n)(t) }
}
