object Session1Snippets {
  //code here
  def head(elements: Array[String]): String = {
    elements(0)
  }

  def reverse(elements: Array[String]): Array[String] = {
    val result = new Array[String](elements.length)

    for(index <- elements.length - 1 to 0 by -1)
      result(elements.length - (index + 1)) = elements(index)

    result
  }

}
