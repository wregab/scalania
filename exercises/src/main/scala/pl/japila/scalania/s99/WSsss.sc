package pl.japila.scalania.s99

object WSsss {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val hh = List(1,List(1,2,3),List(9,List(2)))    //> hh  : List[Any] = List(1, List(1, 2, 3), List(9, List(2)))
  Solution.p7(hh)                                 //> res0: Seq[Any] = List(1, List(1, 2, 3), List(9, List(2)))
  val licz = List(1,2,3,4,5,5,6)                  //> licz  : List[Int] = List(1, 2, 3, 4, 5, 5, 6)
  licz.foldRight("")((liczba,acc) => if (liczba%2==0) acc+"a" else acc+"b" )
                                                  //> res1: String = abbabab
  val xs = Map("a" -> List(11,111), "b" -> List(22,222)).flatMap(_._2)
                                                  //> xs  : scala.collection.immutable.Iterable[Int] = List(11, 111, 22, 222)
  
  List('a,'b) match {
   case a +: b +: Nil if a==b => println("wooow")
   case a +: _ +: Nil => println("rozne")
  }                                               //> rozne
  S99_P14.duplicate("abra")                       //> res2: Seq[Char] = Vector(a, a, b, b, r, r, a, a)
}