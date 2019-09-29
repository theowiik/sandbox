package sandbox

import sandbox.model.IModel
import sandbox.model.ModelImpl
import sandbox.view.IView
import sandbox.view.ViewImpl

class App {
  private val model: IModel
  private val view: IView

  init {
    model = ModelImpl()
    view = ViewImpl(model)
  }

  fun start() {
    for (i in 0..100) {
      view.repaint()
    }
  }
}

fun main() {
  val app = App()
  app.start()
}
