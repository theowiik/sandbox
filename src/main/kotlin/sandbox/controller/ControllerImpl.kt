package sandbox.controller

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

  override fun run() {
    stage.show()
  }
}