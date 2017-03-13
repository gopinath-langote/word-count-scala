

case class WordCounter() {
  val wordSplitRegex: String = """[\s|:|.|,|\d|"]+"""

  def mostOccurring(bookText: String, stopWordText: String): String = {
    val bookWords = bookText.split(wordSplitRegex).toSet
    val stopWords = stopWordText.split(wordSplitRegex).toSet

    val filteredBookText: Set[String] = bookWords.filterNot(stopWords)
    val mapWordToCount: Map[String, Int] = filteredBookText.groupBy(identity).mapValues(_.size)
    mapWordToCount.toList.sortBy(t => (-t._2, t._1)).head._1
  }
}
