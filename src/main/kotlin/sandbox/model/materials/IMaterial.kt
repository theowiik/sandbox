package sandbox.model.materials

import sandbox.model.colors.IColor

/**
 * The IMaterial interface represents a material.
 */
interface IMaterial {
  val name: String
  val color: IColor
}