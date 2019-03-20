import org.scalatest.FunSuite

class Session1SnippetsTest extends FunSuite {

  test("Head of array [\"e1\", \"e2\", \"e3\", \"e4\"] should be \"e1\"") {
    val elements:Array[String] = Array("e1", "e2", "e3", "e4")

    assert(Session1Snippets.head(elements) === "e1")
  }

  test("Linear search the elem 5 in array [6, 1, 3, 0, 5, 6] should return index 4") {
    val elements:Array[Int] = Array(6, 1, 3, 0, 5, 6)
    val indexElem = Session1Snippets.search(elements, 5)
    assert(indexElem === 4)
  }


  test("Linear search the elem 7 in array [6, 1, 3, 0, 5, 6] should return index -1") {
    val elements:Array[Int] = Array(6, 1, 3, 0, 5, 6)
    val indexElem = Session1Snippets.search(elements, 7)
    assert(indexElem === -1)
  }

  test("Multiplying identity matrix by a vector should return the same vector"){
    val matrix =  Array(Array(1, 0, 0), Array(0, 1, 0), Array(0, 0, 1))
    val vector = Array(2, 3, 1)
    val resultVector = Session1Snippets.multiply(matrix, vector)
    assert(resultVector.length === matrix.length)
    assert(resultVector.deep === vector.deep)
  }

  test("Multiplying all 1 (4x3) matrix by a vector should return " +
                "a vector (3) with all elements equal to the sum"){
    val matrix =  Array(Array(1, 1, 1, 1), Array(1, 1, 1, 1), Array(1, 1, 1, 1))
    val vector = Array(1, 3, 2, 1)
    val resultVector = Session1Snippets.multiply(matrix, vector)
    assert(resultVector.length === matrix.length)
    assert(resultVector.deep === Array(7,7,7).deep)
  }

  test("Binary search the elem 12 in array [3, 4, 6, 8, 12, 14] should return index 4"){
    val elements:Array[Int] = Array(3, 4, 6, 8, 12, 14)
    val indexElem = Session1Snippets.binarySearch(elements, 12)
    assert(indexElem === 4)
  }

  test("Binary search the elem 1 in array [3, 4, 6, 8, 12, 14] should return index -1"){
    val elements:Array[Int] = Array(3, 4, 6, 8, 12, 14)
    val indexElem = Session1Snippets.binarySearch(elements, 1)
    assert(indexElem === -1)
  }

  test("Binary search the elem 8 in array [3, 4, 6, 8, 12, 14] should return index 3"){
    val elements:Array[Int] = Array(3, 4, 6, 8, 12, 14)
    val indexElem = Session1Snippets.binarySearch(elements, 8)
    assert(indexElem === 3)
  }

  test("Sort array [4, 3, 6, 14, 12, 8] should return array [3, 4, 6, 8, 12, 14]"){
    val elements:Array[Int] = Array(4, 3, 6, 14, 12, 8)
    val expectedSorted:Array[Int] = Array(3, 4, 6, 8, 12, 14)
    val result = Session1Snippets.mergeSort(elements)
    assert(result.deep === expectedSorted.deep)
  }

  test("Merge Array [1, 2, 3, 4] and Array [5, 6] should return Array [1,2,3,4,5,6]"){
    val part1: Array[Int] = Array(1, 2, 3, 4)
    val part2: Array[Int] = Array(5, 6)
    val expectedResult: Array[Int] = Array(1,2,3,4,5,6)
    val result = Session1Snippets.merge(part1, part2)
    assert(result.deep == expectedResult.deep)
  }


}
