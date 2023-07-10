package com.pravera.flutter_activity_recognition.models

import com.google.gson.annotations.SerializedName
import java.util.*

data class ActivityTransitionData(
	@SerializedName("activityType") val activityType: String,
	@SerializedName("transitionType") val transitionType: String,
	@SerializedName("recognizedAt") val recognizedAt: Date
)
