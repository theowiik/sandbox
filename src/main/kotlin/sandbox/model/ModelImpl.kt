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
    val output = mutableListOf<List<IColor>>()

    for (row in world.getPixels()) {
      val tempRow = mutableListOf<IColor>()
      for (pixel in row) tempRow += pixel.getColor()
      output.add(tempRow)
    }

    return output
  }
}