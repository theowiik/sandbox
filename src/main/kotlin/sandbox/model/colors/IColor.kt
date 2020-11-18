package sandbox.model.colors

/**
 * The IColor interface represents a color.
 */
interface IColor {

  /**
   * The red color component in the range [0, 255].
   */
  var red: Int

  /**
   * The green color component in the range [0, 255].
   */
  var green: Int

  /**
   * The blue color component in the range [0, 255].
   */
  var blue: Int

  /**
   * The transparency value in the range [0, 255].
   */
  var alpha: Int
}