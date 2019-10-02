package sandbox.model

import sandbox.model.materials.rigidbodies.RigidBody
import sandbox.model.materials.rigidbodies.Sand

/**
 * Implementation of the IModel interface.
 *
 * @see IModel
 */
class ModelImpl() : IModel {
  private val world: World = World()

  override fun getWorld(): World {
    return world
  }
}