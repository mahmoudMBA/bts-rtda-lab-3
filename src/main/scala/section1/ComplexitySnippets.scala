package section1

object ComplexitySnippets {

  def min(inputArray: Array[Int]) : Int = {
    var minValue: Int = Int.MaxValue
    for(item <- inputArray){
      if(item < minValue) minValue = item
    }
    return minValue
  }


  def _binarySearch(elements: Array[Int], elem: Int, from: Int,
                    to: Int): Int = {
    if(from > to)
      return -1
    val mid = (from + to) / 2
    if(elements(mid) == elem)
      return mid
    if(elements(mid) > elem)
      return _binarySearch(elements, elem, from, mid - 1)
    return _binarySearch(elements, elem, mid + 1, to)
  }

  def binarySearch(elements: Array[Int], elem: Int) :Int = {
    return _binarySearch(elements, elem, 0, elements.length - 1)
  }


  def multiply(matrix: Array[Array[Int]], vector: Array[Int])
  : Array[Int] = {
    val resultVector:Array[Int] = Array.ofDim(matrix.length)
    for(i <- 0 to matrix.length - 1) {
      var dotProduct = 0;
      for (j <- 0 to vector.length - 1){
        dotProduct = dotProduct + matrix(i)(j)*vector(j)
      }
      resultVector(i) = dotProduct
    }
    return resultVector
  }

  def head(elements: Array[String]): String = {
    elements(0)
  }

  def search(elements: Array[Int], elem: Int): Int = {
    for(index <- 0 to elements.length - 1)
      if(elements(index) == elem) return index
    -1
  }

  def merge(par1: Array[Int], par2: Array[Int]) : Array[Int] = {
    val complete = Array.ofDim[Int](par1.length + par2.length)
    var i: Int = 0; var j: Int = 0; var k = 0;
    while(i < par1.length && j < par2.length) {
      if(par1(i) < par2(j)) {
        complete(k) = par1(i); i = i + 1
      } else {
        complete(k) = par2(j); j = j + 1
      }
      k = k + 1
    }
    while (i < par1.length){
      complete(k) = par1(i); i = i + 1; k = k + 1
    }
    while (j < par2.length){
      complete(k) = par2(j); j = j + 1; k = k + 1
    }
    complete
  }

  def mergeSort(elements: Array[Int]): Array[Int] ={
    if(elements.length == 1 || elements.length == 0) return elements
    val mid = elements.length / 2;
    val part1 = elements.slice(0, mid)
    val part2 = elements.slice(mid, elements.length + 1)
    return merge(mergeSort(part1), mergeSort(part2))
  }

}
