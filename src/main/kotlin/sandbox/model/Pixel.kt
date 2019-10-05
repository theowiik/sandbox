package sandbox.model

import sandbox.model.colors.ColorImpl
import sandbox.model.colors.IColor
import sandbox.model.materials.IMaterial

/**
 * The pixel class is the container of a material.
 */
class Pixel(
    private var content: IMaterial? = null
) {

  /**
   * Checks if pixel class is holding a material.
   *
   * @return true if pixel is holding a material, false otherwise.
   */
  fun hasMaterial(): Boolean {
    return content != null
  }

  /**
   * Returns the color of the material it is holding. Returns a transparent color if the pixel isn't
   * holding a material.
   */
  fun getColor(): IColor {
    // TODO: Do not return the same reference to the color.
    return content?.color ?: ColorImpl(0, 0, 0, 0)
  }
}