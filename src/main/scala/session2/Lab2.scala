package session2

object Lab2 {
  def sum(array: Array[Int]): Int = {
    var sumAccumulator: Int = 0;
    for(item <- array){
      sumAccumulator+= item
    }
    return sumAccumulator
  }

  //TO DO!
  def min(array: Array[Int]) : Int = ???

  //TO DO!
  def max(array: Array[Int]): Int = 6

  //TO DO!
  def avg(array: Array[Double]): Double = ???

  //TO DO!
  def minMaxDiff(array: Array[Int]): Int = ???
}
