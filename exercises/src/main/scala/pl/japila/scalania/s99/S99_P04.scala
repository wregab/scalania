package pl.japila.scalania.s99

import scala.annotation.tailrec

object S99_P04 {
  def length[T](ts: Seq[T]): Int = {
    @tailrec
    def lengthRec[T](acu: Int, ts: Seq[T]): Int = ts match {
      case Nil => acu
      case h +: tail => lengthRec(acu + 1, tail)
    }
    lengthRec(0, ts)
  }
}

