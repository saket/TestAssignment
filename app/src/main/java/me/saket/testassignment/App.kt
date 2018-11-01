package me.saket.testassignment

import android.app.Application
import com.gabrielittner.threetenbp.LazyThreeTen
import timber.log.Timber
import timber.log.Timber.DebugTree

class App : Application() {

  override fun onCreate() {
    super.onCreate()
    Timber.plant(DebugTree())
    LazyThreeTen.init(this)
  }
}
