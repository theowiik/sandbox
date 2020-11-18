package sandbox.model

import kotlin.math.sqrt

/**
 * A two-dimensional vector.
 */
class Vector(
    var x: Double,
    var y: Double
) {

  /**
   * Returns a normalized vector with the same direction as the vector.
   * Returns a null vector if the vector is a null vector.
   *
   * @return a normalized vector with the same direction.
   */
  fun normalized(): Vector {
    return if (x == 0.0 && y == 0.0) {
      Vector(0.0, 0.0)
    } else {
      Vector((x / length()), (y / length()))
    }
  }

  /**
   * Returns the length of the vector.
   *
   * @return the length of the vector.
   */
  fun length(): Double {
    return sqrt(x * x + y * y)
  }
}