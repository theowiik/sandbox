package sandbox.model

import sandbox.model.materials.Material

class Pixel(var content: Material? = null) {

  /**
   * Checks if pixel class is holding a material.
   *
   * @return true if pixel is holding a material, false otherwise.
   */
  fun hasMaterial(): Boolean {
    return content != null
  }
}