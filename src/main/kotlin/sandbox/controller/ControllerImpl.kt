package sandbox.controller

import javafx.stage.Stage
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

  override fun run() {
    stage.show()
  }
}