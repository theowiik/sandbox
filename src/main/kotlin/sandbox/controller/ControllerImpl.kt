package sandbox.controller

import javafx.scene.Scene
import javafx.scene.input.KeyCode
import javafx.stage.Stage
import sandbox.controller.components.SandboxPane
import sandbox.model.IModel
import sandbox.view.IView

/**
 * The ControllerImpl class is a implementation of the IController interface.
 *
 * @see IController
 */
class ControllerImpl(
    private val model: IModel,
    private val view: IView,
    private val stage: Stage
) : IController {
  private val sandboxPane: SandboxPane = SandboxPane(model, this)

  init {
    view.graphicsContext = sandboxPane.getGraphicsContext()

    // Setup scene
    val scene = Scene(sandboxPane, 1280.0, 720.0)
    stage.scene = scene
    stage.title = "Sandbox"

    bindDebuggingButtons(scene)
  }

  // TODO: Only for dev
  private fun bindDebuggingButtons(scene: Scene) {
    scene.setOnKeyPressed { e ->
      run {
        if (e.code == KeyCode.RIGHT) {
          view.repaint()
        }
      }
    }
  }

  override fun run() {
    stage.show()
  }
}