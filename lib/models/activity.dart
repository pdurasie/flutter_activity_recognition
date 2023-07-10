import 'package:flutter_activity_recognition/models/activity_type.dart';
import 'package:flutter_activity_recognition/models/transition_type.dart';

/// A model representing the user's activity.
class ActivityTransition {
  /// The type of activity recognized.
  final ActivityType activityType;

  /// The type of activity recognized.
  final TransitionType transitionType;

  /// Timestamp of when the activity was recognized.
  final DateTime? recognizedAt;

  /// Constructs an instance of [ActivityTransition].
  const ActivityTransition(
      this.activityType, this.transitionType, this.recognizedAt);

  /// Returns the data fields of [ActivityTransition] in JSON format.
  Map<String, dynamic> toJson() => {
        'activityType': activityType,
        'transitionType': transitionType,
        'recognizedAt': recognizedAt
      };

  @override
  bool operator ==(Object other) =>
      other is ActivityTransition &&
      runtimeType == other.runtimeType &&
      activityType == other.activityType &&
      transitionType == other.transitionType &&
      recognizedAt == other.recognizedAt;

  @override
  int get hashCode =>
      activityType.hashCode ^ transitionType.hashCode ^ recognizedAt.hashCode;
}
