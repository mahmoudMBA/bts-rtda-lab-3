import org.scalatest.FunSuite

class Session1SnippetsTest extends FunSuite {

  test("testing head snippet") {
    val elements:Array[String] = Array("e1", "e2", "e3", "e4")

    assert(Session1Snippets.head(elements)==="e1")
  }

  test("Testing reverse array snippet") {
    val elements:Array[String] = Array("e1", "e2", "e3", "e4")
    val reverseElementsExpected:Array[String] = Array("e4", "e3", "e2", "e1")
    val reverseElements = Session1Snippets.reverse(elements)
    assert(reverseElements.deep == reverseElementsExpected.deep)
  }
  
  test("Testing ")


}
