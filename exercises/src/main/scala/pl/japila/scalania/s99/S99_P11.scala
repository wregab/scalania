package pl.japila.scalania.s99

object S99_P11 {
  def encodeModified[T](ts: Seq[T]): Seq[Either[(Int, T), T]] = S99_P10.encode(ts).map({
    case (i, elem) =>
      if (i == 1)
        Right(elem)
      else
        Left((i, elem))
  }
  )
}
