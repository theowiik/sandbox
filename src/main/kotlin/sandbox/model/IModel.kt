package sandbox.model

import sandbox.model.colors.IColor
import sandbox.model.materials.rigidbodies.RigidBody

/**
 * Facade for the main model component.
 */
interface IModel {

  /**
   * Returns a representation of the world. It is represented by the materials colors.
   */
  fun getWorldColors(): List<List<IColor>>
}