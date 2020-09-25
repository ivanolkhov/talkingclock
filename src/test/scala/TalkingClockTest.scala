class TalkingClockTest extends org.scalatest.funsuite.AnyFunSuite {
  test("talk 12:35") {
    assert(TalkingClock.talk("12:35") === "It's twelve thirty five pm")
  }
  test("talk 00:45") {
    assert(TalkingClock.talk("00:45") === "It's twelve fourty five am")
  }
  test("talk 18:00") {
    assert(TalkingClock.talk("18:00") === "It's six pm")
  }
}