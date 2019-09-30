package sandbox.model.materials.rigidbodies

/**
 * The Sand class is a type of rigid body.
 *
 * @see RigidBody
 */
class Sand() : RigidBody(
    name = "Sand"
) {

  override fun name(): String {
    return name
  }
}