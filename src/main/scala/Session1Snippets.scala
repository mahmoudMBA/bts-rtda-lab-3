object Session1Snippets {

  def _binarySearch(elements: Array[Int], elem: Int, from: Int, to: Int): Int = {
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


  def multiply(matrix: Array[Array[Int]], vector: Array[Int]): Array[Int] = {
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

  //code here
  def head(elements: Array[String]): String = {
    elements(0)
  }

  def search(elements: Array[Int], elem: Int): Int = {
    for(index <- 0 to elements.length - 1)
      if(elements(index) == elem) return index
    -1
  }

}
