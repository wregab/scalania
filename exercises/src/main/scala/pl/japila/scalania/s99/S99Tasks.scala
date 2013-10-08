package pl.japila.scalania.s99

import annotation.tailrec

object S99Tasks {

}

trait S99TasksSolution {
  def p1[T](list : Seq[T]) : T
  def p2[T](list : Seq[T]) : T
  def p3[T](k: Int, l: Seq[T]) : T
  def p4(list : Seq[_]) : Int
  def p5[T](list : Seq[T]) : Seq[T]
  def p6[T](list : Seq[T]) : Boolean
  def p7(list : Seq[Any]) : Seq[Any]
  def p8[T](list : Seq[T]) : Seq[T]
  def p9[T](list : Seq[T]) : Seq[Seq[T]]
  def p10[T](list : Seq[T]) : Seq[(Int,T)]
  def p11[T](list : Seq[T]) : Seq[Either[(Int,T),T]]
  def p12[T](list : Seq[(Int,T)]) : Seq[T]
  def p13[T](list : Seq[T]) : Seq[(Int,T)]
  def p14[T](list : Seq[T]) : Seq[T]
  def p15[T](nr: Int, list : Seq[T]) : Seq[T]
  def p16[T](nr: Int, list : Seq[T]) : Seq[T]
  def p17[T](nr: Int, list : Seq[T]) : (Seq[T],Seq[T])
  def p18[T](from: Int,to: Int, list : Seq[T]) : Seq[T]
  def p19[T](nr: Int, list : Seq[T]) : Seq[T]
  def p20[T](nr: Int, list : Seq[T]) : (Seq[T],T)
  def p21[T](toAdd: T, position: Int, list : Seq[T]) : Seq[T]
  def p22(from:Int, to:Int): Seq[Int]
  def p23[T](sel:Int, list: Seq[T]): Seq[T]
  def p24(from:Int, to:Int): Seq[Int]
  def p25[T](list : Seq[T]) : Seq[T]
  def p26[T](combined:Int, list : Seq[T]) : Seq[Seq[T]]
  def p27[T](list : Seq[T]) : Seq[Seq[Seq[T]]]
  def p28[T](list : Seq[Seq[T]]) : Seq[Seq[T]]
}

class S99TasksSolutionNotImplemented extends S99TasksSolution {
  def p1[T](list: Seq[T]): T = ???
  
  def p2[T](list: Seq[T]): T = ???

  def p3[T](k: Int, l: Seq[T]): T = ???

  def p4(list: Seq[_]): Int = ???

  def p5[T](list: Seq[T]): Seq[T] = ???

  def p6[T](ls: Seq[T]): Boolean = ls match {
    case Nil => true
    case h :: Nil => true
    case _ => ls.head == ls.last && p6(ls.tail.reverse.tail)
  }

  def p7(ls: Seq[Any]): Seq[Any] = Solution.p7(ls)

  def p8[T](ls: Seq[T]): Seq[T] = ls match{ 
    case Nil => Nil
    //case x::Nil => List(x)
    case x::xs => x+: p8(xs.dropWhile(_==x))
  }

  def p9[T](ls: Seq[T]): Seq[Seq[T]] = ls match {
    case Nil => Nil
    case x::xs => 
      val (pocz,koniec)=ls.span( _==x )
      List(pocz) ++ p9(koniec)
  }

  def p10[T](ls: Seq[T]): Seq[(Int, T)] = 
    p9(ls) map ( sekw=> (sekw.length,sekw.head) )
    
    /*ls match {
    case Nil => Nil
    case x::xs => {
      val (pocz,koniec)=ls.span( _==x )
      List( (pocz.length,x) ) ++ p10(koniec)
    }
  }*/

  def p11[T](list: Seq[T]): Seq[Either[(Int, T), T]] = p10(list) 
  		.map ( para => para._1 match {
  		  case 1 => Right(para._2)
  		  case _ => Left(para)
  		} )

  def p12[T](ts: Seq[(Int, T)]): Seq[T] = ts match{
    case Nil => Nil
  	case (1,t)::xs => t +: p12(xs)
  	case (num,t)::xs => t +: p12( ( num -1,t) +: xs )
  } 

  def p13[T](list: Seq[T]): Seq[(Int, T)] = ???

  def p14[T](list: Seq[T]): Seq[T] = ???

  def p15[T](nr: Int, list: Seq[T]): Seq[T] = ???

  def p16[T](nr: Int, list: Seq[T]): Seq[T] = ???

  def p17[T](nr: Int, list: Seq[T]): (Seq[T], Seq[T]) = ???

  def p18[T](from: Int, to: Int, list: Seq[T]): Seq[T] = ???

  def p19[T](nr: Int, list: Seq[T]): Seq[T] = ???

  def p20[T](nr: Int, list: Seq[T]): (Seq[T],T) = ???

  def p21[T](toAdd: T, position: Int, list: Seq[T]): Seq[T] = ???

  def p22(from: Int, to: Int): Seq[Int] = ???

  def p23[T](sel: Int, list: Seq[T]): Seq[T] = ???

  def p24(from: Int, to: Int): Seq[Int] = ???

  def p25[T](list: Seq[T]): Seq[T] = ???

  def p26[T](combined: Int, list: Seq[T]): Seq[Seq[T]] = ???

  def p27[T](list: Seq[T]): Seq[Seq[Seq[T]]] = ???

  def p28[T](list: Seq[Seq[T]]): Seq[Seq[T]] = ???

}