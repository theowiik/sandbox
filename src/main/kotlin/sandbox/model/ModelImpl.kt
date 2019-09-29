package sandbox.model

/**
 * Implementation of the IModel interface.
 *
 * @see IModel
 */
class ModelImpl() : IModel {
  private val world = mutableListOf<MutableList<RigidBody>>()

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
      val tempRow = mutableListOf<RigidBody>()
      for (w in 0..width) {
        tempRow.add(RigidBody(Vector(0.0, 0.0)))
      }
      world.add(tempRow)
    }
  }

  override fun getWorld(): List<List<RigidBody>> {
    return world
  }
}