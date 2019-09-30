package sandbox

import javafx.application.Application
import javafx.stage.Stage
import sandbox.model.IModel
import sandbox.model.ModelImpl
import sandbox.view.IView
import sandbox.view.ViewImpl

class App : Application() {
  override fun start(primaryStage: Stage) {
    val model: IModel = ModelImpl()
    val view: IView = ViewImpl(model)

  }
}

fun main(args: Array<String>) {
  Application.launch(App::class.java, *args)
}