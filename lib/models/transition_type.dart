/// Defines the transition type (enter or exit).
enum TransitionType {
  /// The user starts the activity.
  ENTER,

  /// The user exits the activity.
  EXIT,

  /// Unable to detect the current transition type.
  UNKNOWN;

  factory TransitionType.fromString(String? value) {
    return TransitionType.values.firstWhere(
        (e) => e.toString() == 'TransitionType.$value',
        orElse: () => TransitionType.UNKNOWN);
  }
}
