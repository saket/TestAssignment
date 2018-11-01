package me.saket.testassignment

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import me.saket.testassignment.timestamp.RelativeTimestampGenerator
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.threeten.bp.Clock
import org.threeten.bp.LocalDateTime
import org.threeten.bp.ZoneOffset.UTC

@RunWith(AndroidJUnit4::class)
class RelativeTimestampGeneratorAndroidTest {

  lateinit var timestampGenerator: RelativeTimestampGenerator

  private val context
    get() = InstrumentationRegistry.getInstrumentation().targetContext

  @Before
  fun setUp() {
    // When testing time calculations, it is important to not depend on the system clock.
    // By using a fixed clock, it's easier to write tests knowing that time is predictable.
    val today = LocalDateTime.parse("2018-10-20T10:15:30")
    val fixedClock = Clock.fixed(today.atZone(UTC).toInstant(), UTC)

    timestampGenerator = RelativeTimestampGenerator(fixedClock)
  }

  @Test
  fun if_the_date_is_of_today_then_today_text_should_be_generated() {
    val today = LocalDateTime.parse("2018-10-20T10:00:00")

    // TODO: Make this pass. To run this test, click the small play icon next to the line numbers.
//    val timestamp: RelativeTimestamp = timestampGenerator.generate(today)
//    val displayText = timestamp.displayText(context)
//
//    assertThat(displayText).isEqualTo(context.getString(R.string.today))
  }

  @Test
  fun if_the_date_is_of_yesterday_then_yesterday_text_should_be_generated() {
    val yesterday = LocalDateTime.parse("2018-10-19T23:00:00")
    TODO()
  }

  @Test
  fun if_the_date_is_within_the_current_month_then_a_short_timestamp_should_be_generated() {
    val withinThisMonth = LocalDateTime.parse("2018-10-05T23:00:00")
    TODO()
  }

  fun if_the_date_is_older_than_the_current_month_then_show_the_full_date() {
    val oldDate = LocalDateTime.parse("2017-12-01T23:00:00")
    TODO()
  }
}
