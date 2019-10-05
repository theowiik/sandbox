package sandbox.view

import javafx.scene.canvas.GraphicsContext
import sandbox.model.IModel

/**
 * Implementation of the IView interface.
 *
 * @see IView
 */
class ViewImpl(
    private val model: IModel,
    override var graphicsContext: GraphicsContext? = null
) : IView {
  override fun repaint() {
  }
}