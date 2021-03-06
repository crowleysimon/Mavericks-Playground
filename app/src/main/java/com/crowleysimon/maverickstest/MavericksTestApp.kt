package com.crowleysimon.maverickstest

import android.app.Application
import com.airbnb.mvrx.Mavericks

class MavericksTestApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Mavericks.initialize(this)
    }
}