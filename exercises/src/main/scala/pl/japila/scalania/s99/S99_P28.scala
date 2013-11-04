package pl.japila.scalania.s99

object S99_P28 {
  def lsort[T](ts: Seq[Seq[T]]): Seq[Seq[T]] = ???
  def lsortFreq[T](tss: Seq[Seq[T]]): Seq[Seq[T]] = 
    tss.foldRight(Map[Int, Seq[Seq[T]]]())((e, res) =>
      //      res.get(e.length) match {
      //      case None => res + ((e.length, List(e)))
      //      case Some(prev) => res + ((e.length, e +: prev))
      //    }
      res + ((e.length, e +: res.getOrElse(e.length, Seq[Seq[T]]())))
    ).toList.sortWith(_._2.length <= _._2.length)
      .flatMap(_._2)
}