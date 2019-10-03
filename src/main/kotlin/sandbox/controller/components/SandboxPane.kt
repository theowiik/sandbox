package sandbox.controller.components

import javafx.scene.layout.AnchorPane
import sandbox.controller.IController
import sandbox.model.IModel

/**
 * The main window.
 */
class SandboxPane(
    val model: IModel,
    val controller: IController
) : AnchorPane() {
  val sandboxPane: SandboxPane = SandboxPane(model, controller)
}