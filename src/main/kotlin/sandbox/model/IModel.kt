package sandbox.model

/**
 * Facade for the main model component.
 */
interface IModel {

  /**
   * Returns a matrix of the world.
   */
  fun getWorld(): List<List<RigidBody>>
}