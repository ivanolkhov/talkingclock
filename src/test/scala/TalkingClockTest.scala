class TalkingClockTest extends org.scalatest.funsuite.AnyFunSuite {
  test("TalkingClockTest") {
    assert(TalkingClock.talk("12:35") === "It's twelve thirty five pm")
  }
}