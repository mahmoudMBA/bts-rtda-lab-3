package session2

object Lab2 {
  /*
    Given and array of elements calculate the sum
  */
  def sum(array: Array[Int]): Int = {
    var sumAccumulator: Int = 0
    for(item <- array){
      sumAccumulator+= item
    }
    return sumAccumulator
  }

  /*
    Given and array of elements calculate the max
  */
  //TO DO!
  def min(array: Array[Int]) : Int = ???

  /*
    Given and array of elements calculate the min
  */
  //TO DO!
  def max(array: Array[Int]): Int = ???

  /*
  Given and array of "Double" elements calculate the average
  */
  //TO DO!
  def avg(array: Array[Double]): Double = ???


  /*
  Given and array of elements calculate the diff between max and min
  */
  //TO DO!
  def minMaxDiff(array: Array[Int]): Int = ???
}
