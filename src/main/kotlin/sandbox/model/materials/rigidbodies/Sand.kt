package sandbox.model.materials.rigidbodies

import sandbox.model.colors.ColorImpl
import sandbox.model.colors.IColor

/**
 * The Sand class is a type of rigid body.
 *
 * @see RigidBody
 */
class Sand() : RigidBody() {
  override val name: String = "Sand"
  override val color: IColor = ColorImpl(0xc2, 0xb2, 0x80)
}