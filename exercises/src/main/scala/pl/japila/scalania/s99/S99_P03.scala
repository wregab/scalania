package pl.japila.scalania.s99

object S99_P03 {
  def nth[T](k: Int, ts: Seq[T]): T = k match {
    case 0 => ts.head
    case _ => nth(k - 1, ts.tail)
  }
}
