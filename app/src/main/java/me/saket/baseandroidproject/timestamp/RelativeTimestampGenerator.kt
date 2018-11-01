package me.saket.baseandroidproject.timestamp

import android.content.Context
import org.threeten.bp.Clock

class RelativeTimestampGenerator(val clock: Clock) {


}

sealed class RelativeTimestamp {
  abstract fun displayText(context: Context): String
}

object Today : RelativeTimestamp() {
  override fun displayText(context: Context) = TODO()
}
