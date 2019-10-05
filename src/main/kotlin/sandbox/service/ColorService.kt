package sandbox.service

import javafx.scene.paint.Color
import sandbox.model.colors.IColor

/**
 * Useful color services.
 */
class ColorService {
  companion object {
    /**
     * Converts an IColor to a JavaFX color.
     */
    fun colorToFXColor(color: IColor): Color {
      val max = 255
      return Color(
          color.red.toDouble() / max,
          color.green.toDouble() / max,
          color.blue.toDouble() / max,
          color.alpha.toDouble() / max
      )
    }
  }
}