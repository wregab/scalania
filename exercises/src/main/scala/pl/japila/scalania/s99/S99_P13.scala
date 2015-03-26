package pl.japila.scalania.s99

object S99_P13 {
  /**
   * Implement the so-called run-length encoding data compression method directly, i.e.
   * don't use other methods you've written (like P09's pack); do all the work directly.
   *
   * scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
   * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
   */
  def encodeDirect[T](ts: Seq[T]): Seq[(Int, T)] = {
    def encodeRec(ts: Seq[T], acu: Seq[(Int, T)]): Seq[(Int, T)] =
    ts match {
      case Nil => acu.reverse
      case _ => {

        val (heads, tail): (Seq[T], Seq[T]) = ts.span(_==ts.head)
        val currentFormed = (heads.length, ts.head)
        encodeRec(tail, currentFormed+:acu)
      }
    }

    encodeRec(ts, Seq())
  }

}
