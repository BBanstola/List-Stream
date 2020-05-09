object GenericQuickSort {
  def main(args: Array[String]): Unit = {
    val list1 = List(4,5,8,3,2,1,6,7,9)
    val list2 = List("got","sow","yak","abs","app","cat","dog","egg","bow","fee")

    println(qsort(list1))
    println(qsort(list2))
  }

  def qsort[T](xs: List[T]): List[T] = xs match {
    case Nil => Nil
    case head :: tail => {
      val (smaller, rest) = tail.partition(_.asInstanceOf[Comparable[T]].compareTo(head)<0)  // make  > 0 for descending
      qsort(smaller) ::: head :: qsort(rest)
    }
  }
}
