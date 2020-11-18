package sandbox.view

import javafx.scene.canvas.GraphicsContext

/**
 * Interface for the main view component.
 */
interface IView {
  /**
   * The graphics context to draw on.
   */
  var graphicsContext: GraphicsContext?

  /**
   * Repaint the view.
   */
  fun repaint()
}