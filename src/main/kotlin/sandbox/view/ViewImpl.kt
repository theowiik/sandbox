package sandbox.view

import sandbox.model.IModel

/**
 * Implementation of the IView interface.
 *
 * @see IView
 */
class ViewImpl(private val model: IModel) : IView {
  override fun repaint() {
    for (row in model.getWorld()) {
      for (pixel in row) {
        if (pixel.hasMaterial()) {
          print(pixel.content?.name()?.toCharArray()?.first())
        } else {
          print(" ")
        }
      }
      println("") // New line
    }

    println("-----")
  }
}