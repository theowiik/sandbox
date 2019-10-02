package sandbox.model

import sandbox.model.materials.rigidbodies.RigidBody

/**
 * Facade for the main model component.
 */
interface IModel {

  /**
   * Returns a matrix of the world.
   */
  fun getWorld(): World
}