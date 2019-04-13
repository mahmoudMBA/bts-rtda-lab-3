package session2

import org.scalatest.FunSuite

class Lab2Test extends FunSuite {
  /*
    Given and array of elements calculate the sum
  */
  test("The sum of array [1, 3, 5, 6] should be 15"){
    val expectedSum = 15
    val array: Array[Int] = Array(1,3,5,6)
    val realSum: Integer = Lab2.sum(array)
    assert(expectedSum == realSum)
  }

  /*
    Given and array of elements calculate the max
  */
  test("The max of array [1, 3, 5, 6] should be 6"){
    val expectedMax = 6
    val array: Array[Int] = Array(1,3,5,6)
    val realMax: Integer = Lab2.max(array)
    assert(expectedMax == realMax)
  }

  /*
  Given and array of elements calculate the min
*/
  test("The min of array [1, 3, 5, 6] should be 5"){
    val expectedMin = 1
    val array: Array[Int] = Array(1,3,5,6)
    val realMin: Integer = Lab2.min(array)
    assert(expectedMin == realMin)
  }

  /*
    Given and array of elements calculate the diff between max and min
  */
  test("The between max and min of array [1, 3, 5, 6] should be 5"){
    val expectedDiff = 5
    val array: Array[Int] = Array(1,3,5,6)
    val realDiff: Integer = Lab2.minMaxDiff(array)
    assert(expectedDiff == realDiff)
  }

  /*
    Given and array of "Double" elements calculate the average
  */
  test("The avg of array [1.0,1.0,1.0,1.0] should be approximately 1.0"){
    val expectedAvg: Double = 1.0
    val array: Array[Double] = Array(1.0,1.0,1.0,1.0)
    val realAvg: Double = Lab2.avg(array)
    assert(Math.abs(expectedAvg - realAvg) < 0.00000001)
  }
}
