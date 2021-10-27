object Leap {
  def leapYear(year: Int): Boolean = {
    val isLeap = (year % 4, year % 100, year % 400) match {
      case (_, _, 0) => true
      case (_, 0, _) => false
      case (0, _, _) => true
      case _         => false
    }

    isLeap
  }
}
