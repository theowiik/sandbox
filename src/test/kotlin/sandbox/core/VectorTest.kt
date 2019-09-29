package sandbox.core

import kotlin.test.Test
import kotlin.test.assertEquals

internal class VectorTest {
  @Test
  fun normalized() {
    val expectedLength = 1.0

    var vector = Vector(10.0, 0.0);
    assertEquals(expectedLength, vector.normalized().length())



    vector = Vector(0.0, 10.0)
    assertEquals(expectedLength, vector.normalized().length())

    vector = Vector(0.0, 0.0)
    assertEquals(0.0, vector.normalized().length())

    vector = Vector(-240.0, 770.0)
    assertEquals(expectedLength, vector.normalized().length())
  }

  @Test
  fun length() {
    // TODO
  }
}