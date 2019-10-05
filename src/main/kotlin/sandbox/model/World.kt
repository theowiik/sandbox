package sandbox.model

import sandbox.model.materials.rigidbodies.Sand

/**
 * The world class is what contains all pixels (that holds materials).
 */
class World() {

  /**
   * The matrix that contains all the pixels.
   */
  private val matrix: MutableList<MutableList<Pixel>>

  init {
    matrix = generateWorld(720, 720);
  }

  /**
   * Creates and returns a world matrix filled with empty pixels with the provided width and height.
   *
   * @param width the width of the world.
   * @param height the height of the world.
   * @throws IllegalArgumentException if width or height is smaller than 1.
   */
  private fun generateWorld(width: Int, height: Int): MutableList<MutableList<Pixel>> {
    if (width < 1 || height < 1)
      throw IllegalArgumentException("Width and height must be greater than 0.")

    val tempMatrix = mutableListOf<MutableList<Pixel>>()

    for (h in 0..height) {
      val row = generateRow(width)

      tempMatrix.add(row)
    }

    return tempMatrix
  }

  /**
   * Generates and returns a row of pixels with no material.
   *
   * @param width the width of the row.
   * @throws IllegalArgumentException if width is smaller than 1.
   */
  private fun generateRow(width: Int): MutableList<Pixel> {
    if (width < 1) throw IllegalArgumentException("Width must be greater than 0.")

    val row = mutableListOf<Pixel>()
    for (r in 0..width) row.add(Pixel(Sand()))

    return row
  }

  /**
   * Updates the world.
   */
  fun update() {
  }

  /**
   * Returns a matrix of the pixels in the world.
   *
   * @return a matrix of the pixels in the world.
   */
  fun getPixels(): List<List<Pixel>> {
    return matrix
  }
}