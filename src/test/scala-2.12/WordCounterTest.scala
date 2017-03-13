import org.scalatest.{FlatSpec, Matchers}

class WordCounterTest extends FlatSpec with Matchers {
  private val wordCounter = WordCounter()

  "Word Counter" should "return Gopinath, for text \"Hello my name is Gopinath, You can call me Gopinath\" " in {
    val bookText: String = "Hello my name is Gopinath, You can call me Gopinath"
    val stopWordText: String = "is can"

    wordCounter.mostOccurring(bookText, stopWordText) shouldEqual "Gopinath"
  }
  "Word Counter" should "return Hello, for text \"Hello world\"" in {
    val bookText: String = "Hello Words"
    val stopWordText: String = ""

    wordCounter.mostOccurring(bookText, stopWordText) shouldEqual "Hello"
  }
  it should "throw Exception while searching word in empty book" in {
    a[Exception] should be thrownBy {
      val bookText: String = ""
      val stopWordText: String = ""
      wordCounter.mostOccurring(bookText, stopWordText) shouldEqual "Hello"
    }
  }
}
