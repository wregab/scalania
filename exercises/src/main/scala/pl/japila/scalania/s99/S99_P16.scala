package pl.japila.scalania.s99

object S99_P16 {
  def drop[T](nr: Int, list: Seq[T]): Seq[T] =
    list.foldLeft((0, List[T]())) {
      case ((n, filtered), t) => (n + 1, { if ((n + 1) % nr == 0) filtered else filtered :+ t })
    }._2
}
