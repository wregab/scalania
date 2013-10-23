package pl.japila.scalania.s99

object S99_P17 {
  def split[T](n: Int, ts: Seq[T]): (Seq[T], Seq[T]) = //ts.splitAt(n)
    {
      def split(n: Int, ts: Seq[T], acu: Seq[T]): (Seq[T], Seq[T]) =
        if (n <= 0)
          (acu.reverse, ts)
        else
          split(n - 1, ts.tail, ts.head +: acu)
      split(n, ts, Nil)
    }
}
