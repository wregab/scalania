package pl.japila.scalania.s99

object S99_P10 {
  def encode[T](ts: Seq[T]): Seq[(Int, T)] =
    S99_P09.pack(ts)
    .map( (a) => (a.size, a.head) )
}
