package sandbox.model.colors

/**
 * The ColorImpl class is a implementation of the IColor interface.
 *
 * @see IColor
 */
class ColorImpl(
    red: Int = 255,
    green: Int = 0,
    blue: Int = 255
) : IColor {

  private val maxValue = 255;
  private val minValue = 0;

  override var blue = blue
    set(value) {
      field = getClosestLegalColor(value)
    }

  override var green = green
    set(value) {
      field = getClosestLegalColor(value)
    }

  override var red = red
    set(value) {
      field = getClosestLegalColor(value)
    }

  /**
   * Returns the closest legal color in the range [0, 255].
   *
   * @param colorComponent the color component.
   * @return the closest legal color.
   */
  private fun getClosestLegalColor(colorComponent: Int): Int {
    return when {
      colorComponent <= 0 -> minValue
      colorComponent >= maxValue -> maxValue
      else -> colorComponent
    }
  }
}