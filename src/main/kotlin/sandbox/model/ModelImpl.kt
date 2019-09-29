package sandbox.model

import sandbox.model.materials.rigidbodies.RigidBody
import sandbox.model.materials.rigidbodies.Sand

/**
 * Implementation of the IModel interface.
 *
 * @see IModel
 */
class ModelImpl() : IModel {
  private val world = mutableListOf<MutableList<Pixel>>()

  init {
    initWorld()
  }

  /**
   * Initializes the world.
   */
  private fun initWorld() {
    val width = 20
    val height = 10

    for (h in 0..height) {
      val tempRow = mutableListOf<Pixel>()

      for (w in 0..width) {
        tempRow.add(Pixel())

        if ((0..10).random() == 1) {
          tempRow[w].content = Sand()
        }
      }

      world.add(tempRow)
    }
  }

  override fun getWorld(): List<List<Pixel>> {
    return world
  }
}