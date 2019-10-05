package sandbox.model

import sandbox.model.colors.IColor
import sandbox.model.materials.rigidbodies.RigidBody
import sandbox.model.materials.rigidbodies.Sand

/**
 * Implementation of the IModel interface.
 *
 * @see IModel
 */
class ModelImpl() : IModel {
  private val world: World = World()

  override fun getWorldColors(): List<List<IColor>> {
    var output = listOf<IColor>()

    for (row in world.matrix) {
      for (pixel in row) {

      }
    }
  }
}