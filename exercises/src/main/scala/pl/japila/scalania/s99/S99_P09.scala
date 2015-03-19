package pl.japila.scalania.s99

import scala.annotation.tailrec

object S99_P09 {
  def pack[T](ts: Seq[T]): Seq[Seq[T]] = {
    @tailrec
    def packRec(current: Seq[T], acu: Seq[Seq[T]], input: Seq[T]): Seq[Seq[T]] = {
      val CurrentEl = current.head
      input match {
        case Nil => (current +: acu).reverse
        case CurrentEl::tail => packRec(input.head +: current, acu, input.tail)
        case newElement :: tail => packRec( Seq(newElement), current+:acu, input.tail )
      }
    }
    ts match {
      case Nil => Nil
      case t :: tail =>
        val seq: Seq[Seq[T]] = Seq()
        packRec(Seq(t), seq, tail)
    }
  }
}
