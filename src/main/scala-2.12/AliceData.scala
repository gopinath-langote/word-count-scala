import scala.io.{BufferedSource, Source}

object AliceData {
  val bookText: BufferedSource = Source.fromFile("aliceInWonderland.txt")
  val stopWordText: BufferedSource = Source.fromFile("stopWords.txt")
}
