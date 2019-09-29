package sandbox.view

import sandbox.model.IModel

/**
 * Implementation of the IView interface.
 *
 * @see IView
 */
class ViewImpl(private val model: IModel) : IView {
  override fun repaint() {
  }
}