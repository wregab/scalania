package pl.japila.scalania.s99

object S99_P16 {
  def drop[T](n: Int, ts: Seq[T]): Seq[T] =
    ts.foldLeft((0, List[T]())) {
      case ((nr, filtered), t) => (nr + 1,
        {
          if ((nr + 1) % n == 0)
            filtered
          else
            filtered :+ t
        })
    }._2
}
