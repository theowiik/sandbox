package sandbox.model

import sandbox.model.colors.ColorImpl
import sandbox.model.colors.IColor
import sandbox.model.materials.rigidbodies.RigidBody
import kotlin.math.floor

/**
 * The pixel class is the container of a rigid body.
 */
class Pixel(private var rigidBody: RigidBody? = null) {

  /**
   * The width of the pixel in meters (and width == height).
   *
   * TODO: Research how to handle a "property" like this. Does it technically have a setter?
   */
  val pixelLength: Int = 10

  /**
   * The position of the rigid body in the pixel.
   * Zero-indexed, origin is at top left corner.
   */
  val rigidBodyPos: Vector = Vector(0.0, 0.0)

  /**
   * Checks if pixel class is holding a rigid body.
   *
   * @return true if pixel is holding a rigid body, false otherwise.
   */
  fun hasRigidBody(): Boolean {
    return rigidBody != null
  }

  /**
   * Returns the color of the rigid body it is holding. Returns a transparent color if the pixel isn't
   * holding a rigid body.
   */
  fun getColor(): IColor {
    // TODO: Do not return the same reference to the color.
    return rigidBody?.color ?: ColorImpl(0, 0, 0, 0)
  }

  /**
   * Updates the rigid body's position inside the pixel with its velocity.
   */
  fun moveRigidBody() {
    if (!hasRigidBody()) return
    rigidBodyPos.x += rigidBody?.velocity?.x ?: 0.0
    rigidBodyPos.y += rigidBody?.velocity?.y ?: 0.0
  }

  /**
   * Checks if the rigid body is in the pixel.
   *
   * @return true if the rigid body is in the pixel. False otherwise.
   */
  fun isInPixel(): Boolean {
    return !(
        rigidBodyPos.x > pixelLength ||
            rigidBodyPos.x < 0 ||
            rigidBodyPos.y > pixelLength ||
            rigidBodyPos.y < 0
        )
  }

  fun getNewPosOffset(): Vector {
    val xOffset: Int = floor(rigidBodyPos.x / pixelLength).toInt()
    val yOffset: Int = floor(rigidBodyPos.y / pixelLength).toInt()
    return Vector(xOffset.toDouble(), yOffset.toDouble());
  }
}