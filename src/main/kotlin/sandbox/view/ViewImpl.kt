package sandbox.view

import javafx.scene.canvas.GraphicsContext
import javafx.scene.image.Image
import javafx.scene.image.PixelWriter
import javafx.scene.image.WritableImage
import javafx.scene.paint.Color
import sandbox.model.IModel
import sandbox.service.ColorService
import sandbox.service.ImageService

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
    println("repainting")
    graphicsContext?.clearRect(0.0, 0.0, 20.0, 20.0)
    val worldColors = model.getWorldColors()
    val fxImage: Image = ImageService.colorsToFXImage(worldColors)
    graphicsContext?.drawImage(fxImage, 0.0, 0.0)
  }
}