package sandbox.model.materials.rigidbodies

import sandbox.model.Vector
import sandbox.model.materials.IMaterial

/**
 * Rigid body based on unity's "Rigidbody" class.
 */
abstract class RigidBody (
    private val velocity: Vector = Vector(0.0, 0.0)
) : IMaterial {

  /**
   * Adds a force to the rigid body.
   *
   * @param force the force vector.
   */
  fun addForce(force: Vector) {
    velocity.x += force.x
    velocity.y += force.y
  }
}
