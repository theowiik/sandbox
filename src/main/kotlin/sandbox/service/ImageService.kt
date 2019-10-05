package sandbox.service

import javafx.scene.image.Image
import javafx.scene.image.WritableImage
import sandbox.model.colors.IColor

/**
 * Useful services for images.
 */
class ImageService {
  companion object {
    /**
     * Create a image from a matrix of colors.
     *
     * @param colors the matrix of colors.
     * @return a JavaFX image.
     */
    fun colorsToFXImage(colors: List<List<IColor>>): Image {
      val writableImage = WritableImage(colors[0].size, colors.size)
      val pixelWriter = writableImage.pixelWriter

      for ((rowIndex, row) in colors.withIndex()) {
        for ((colIndex, color) in row.withIndex()) {
          val fxColor = ColorService.colorToFXColor(color)
          pixelWriter.setColor(colIndex, rowIndex, fxColor)
        }
      }

      return writableImage
    }
  }
}