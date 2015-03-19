package pl.japila.scalania.s99

import java.util.NoSuchElementException

import scala.annotation.tailrec
import scala.util.{Failure, Success, Try}

object S99_P01 {
  @tailrec
  def last[T](ts: Seq[T]): Try[T] = ts match {
    case Nil => Failure(new scala.NoSuchElementException("empty list does not have last element"))
    case h +: Nil => Success(h)
    case h +: tail => last(tail)
  }
}
