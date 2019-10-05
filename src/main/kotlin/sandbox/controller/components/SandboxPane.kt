package sandbox.controller.components

import javafx.fxml.FXMLLoader
import javafx.scene.layout.AnchorPane
import sandbox.controller.IController
import sandbox.model.IModel
import java.net.URL

/**
 * The main window.
 */
class SandboxPane(
    private val model: IModel,
    private val controller: IController
) : AnchorPane() {
  private val sandboxPane: SandboxPane = SandboxPane(model, controller)

  init {
    val scenePath: URL = URL("root.fxml")
    val loader = FXMLLoader(scenePath)
    loader.setRoot(this)
    loader.setController(this)
  }
}