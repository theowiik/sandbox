package sandbox.model

/**
 * Rigid body based on unity's "Rigidbody" class.
 */
class RigidBody(val velocity: Vector) {

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
