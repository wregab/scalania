package pl.japila.scalania.s99

object S99_P08 {

  def compressRec[T](Previous: T, list: Seq[T], acu: Seq[T]): Seq[T] = list match {
    case Previous +: tail => compressRec(Previous, tail, acu)
    case Nil => acu.reverse
    case h +: tail => compressRec(h, tail, h +: acu)
  }

  def compress[T](ts: Seq[T]): Seq[T] = ts match {
    case Nil => Nil
    case h :: tail => h+:compressRec(h, tail, Seq[T]())
  }
}
//    ts.foldRight((Seq[T](), null) )( (t, B ) => B match {
//      case (tb, poprzednie) =>
//    }
//    )
//  }
//}
