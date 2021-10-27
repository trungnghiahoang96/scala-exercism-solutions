object SpaceAge {
  val yearInSecondOnEarth = 31556736

  def onEarth(seconds: Double, orbitalPeriod: Double = 1): Double =
    Math.round(
      seconds *100 / yearInSecondOnEarth / orbitalPeriod 
    ) / 100.0
  def onMercury(seconds: Double) = onEarth(seconds, 0.2408467)
  def onVenus(seconds: Double) = onEarth(seconds, 0.61519726)
  def onMars(seconds: Double) = onEarth(seconds, 1.8808158)
  def onJupiter(seconds: Double) = onEarth(seconds, 11.862615)
  def onSaturn(seconds: Double) = onEarth(seconds, 29.447498)
  def onUranus(seconds: Double) = onEarth(seconds, 84.016846)
  def onNeptune(seconds: Double) = onEarth(seconds, 164.79132)

}
