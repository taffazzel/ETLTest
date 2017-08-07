@DoNotDiscover
class PrintNameTest extends FlatSpec with Matchers{
  "PrintName" should "divide 2 numbers" in {
    PrintName.divide(10,5) should be (2)
  }

  it should "throw ArithmaticException if attempted to divide by 0" in {
    a[java.lang.ArithmeticException] should be thrownBy {
      PrintName.divide(20,3)
    }
  }
