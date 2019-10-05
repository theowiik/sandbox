package sandbox.controller.components

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.canvas.Canvas
import javafx.scene.layout.AnchorPane
import sandbox.controller.IController
import sandbox.model.IModel
import java.io.IOException
import java.net.URL

/**
 * The main window.
 */
class SandboxPane(
    private val model: IModel,
    private val controller: IController
) : AnchorPane() {

  @FXML
  private var world: Canvas? = null

  init {
    val scenePath = findScene("root.fxml")
    val loader: FXMLLoader = FXMLLoader(scenePath).also {
      it.setRoot(this)
      it.setController(this)
      it.load()
    }
  }

  /**
   * Returns the url to a specific scene file.
   *
   * @param sceneFileName the name of the scene file.
   * @return the url to the scene.
   * @throws IOException if no scene was found.
   */
  private fun findScene(sceneFileName: String): URL {
    val url: URL = this::class.java.classLoader.getResource(sceneFileName)
        ?: throw IOException("File not found: $sceneFileName")

    return url
  }
}