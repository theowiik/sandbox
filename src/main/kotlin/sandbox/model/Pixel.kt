package sandbox.model

import sandbox.model.materials.IMaterial

/**
 * The pixel class is the container of a material.
 */
class Pixel(private var content: IMaterial? = null) {

  /**
   * Checks if pixel class is holding a material.
   *
   * @return true if pixel is holding a material, false otherwise.
   */
  fun hasMaterial(): Boolean {
    return content != null
  }
}