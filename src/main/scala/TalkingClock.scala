object TalkingClock {
  def getHours(time: String): Int = {
    time.split(":").map(_.toInt).head
  }
  def getMinutes(time: String): Int = {
    time.split(":").map(_.toInt).tail.head
  }
}
