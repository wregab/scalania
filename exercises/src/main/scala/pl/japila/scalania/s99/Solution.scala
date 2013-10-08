package pl.japila.scalania.s99

object Solution extends S99TasksSolutionNotImplemented {
  def p6[T](ls: Seq[T]): Boolean = ls match {
    case Nil => true
    case h :: Nil => true
    case _ => ls.head == ls.last && p6(ls.tail.reverse.tail)
  }
  override def p7(ls: Seq[Any]): Seq[Any] = ls match {
    case Nil => Nil
    case Seq(ins: Seq[Any]) :: xs => p7(ins) ++ p7(xs)
    case h :: xs => h +: p7(xs)
  }
  override def p8[T](ls: Seq[T]): Seq[T] = ls match {
    case Nil => Nil
    //case x::Nil => List(x)
    case x :: xs => x +: p8(xs.dropWhile(_ == x))
  }

  override def p9[T](ls: Seq[T]): Seq[Seq[T]] = ls match {
    case Nil => Nil
    case x :: xs =>
      val (pocz, koniec) = ls.span(_ == x)
      List(pocz) ++ p9(koniec)
  }

  override def p10[T](ls: Seq[T]): Seq[(Int, T)] =
    p9(ls) map (sekw => (sekw.length, sekw.head))

  /*ls match {
    case Nil => Nil
    case x::xs => {
      val (pocz,koniec)=ls.span( _==x )
      List( (pocz.length,x) ) ++ p10(koniec)
    }
  }*/

  override def p11[T](list: Seq[T]): Seq[Either[(Int, T), T]] = p10(list)
    .map(para => para._1 match {
      case 1 => Right(para._2)
      case _ => Left(para)
    })

}