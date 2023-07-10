package com.pravera.flutter_activity_recognition.utils

import android.os.SystemClock
import com.google.android.gms.location.ActivityTransition
import com.google.android.gms.location.DetectedActivity
import java.util.*
import java.util.concurrent.TimeUnit

class ActivityRecognitionUtils {
	companion object {
		fun getActivityTypeFromValue(type: Int): String {
			return when (type) {
				DetectedActivity.IN_VEHICLE -> "IN_VEHICLE"
				DetectedActivity.ON_BICYCLE -> "ON_BICYCLE"
				DetectedActivity.RUNNING -> "RUNNING"
				DetectedActivity.STILL -> "STILL"
				DetectedActivity.ON_FOOT,
				DetectedActivity.TILTING,
				DetectedActivity.WALKING -> "WALKING"
				else -> "UNKNOWN"
			}
		}

		fun getActivityTransitionTypeFromValue(type: Int): String {
			return when(type) {
				ActivityTransition.ACTIVITY_TRANSITION_ENTER -> "ENTER"
				ActivityTransition.ACTIVITY_TRANSITION_EXIT -> "EXIT"
				else -> "UNKNOWN"

			}
		}

		fun getDateFromElapsedRealtimeNanos(nanos: Long): Date {
			val currentTimeMillis = System.currentTimeMillis()
			val elapsedRealTimeMillis = SystemClock.elapsedRealtime()
			val bootTimeMillis = currentTimeMillis - elapsedRealTimeMillis
			val yourTimestampMillis = TimeUnit.NANOSECONDS.toMillis(nanos)

			return Date(bootTimeMillis + yourTimestampMillis)
		}
	}
}
