package me.saket.baseandroidproject

import org.junit.Before
import org.junit.Test

class DateOfBirthValidatorTest {

  private lateinit var validator: DateOfBirthValidator

  @Before
  fun setUp() {
    validator = DateOfBirthValidator()
  }

  @Test
  fun `example test - date shouldn't contain empty whitespaces`() {
    // TODO: Make this pass. To run this test, click the small play icon next to the line numbers.
    //val result = validator.validate("  14/06/1992 ")
    //result shouldBeInstanceOf DateOfBirthValidator.Result.ILLEGAL_CHARACTERS
  }

  @Test
  fun `date pattern should be correct`() {
    TODO()
  }

  @Test
  fun `date shouldn't be in the future`() {
    TODO()
  }
}
