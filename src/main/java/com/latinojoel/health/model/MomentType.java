package com.latinojoel.health.model;

import java.util.HashMap;
import java.util.Map;

public enum MomentType {
  BEFORE_BREAKFAST("beforeBreakfast", "Before Breakfast"),
  AFTER_BREAKFAST("afterBreakfast", "After Breakfast"),
  BEFORE_MORNING_EXERCISE("beforeMorningExercise", "Before Morning Breakfast"),
  AFTER_MORNING_EXERCISE("afterMorningExercise", "After Morning Breakfast"),
  BEFORE_LUNCH("beforeLunch", "Before Lunch"),
  AFTER_LUNCH("afterLunch", "After Lunch"),
  BEFORE_AFTERNOON_EXERCISE("beforeAfternoonExercise", "Before Afternoon Exercise"),
  AFTER_AFTERNOON_EXERCISE("afterAfternoonExercise", "After Afternoon Exercise"),
  BEFORE_DINNER("beforeDinner", "Before Dinner"),
  AFTER_DINNER("afterDinner", "After Dinner");

  private String momentType;
  private String label;

  private MomentType(String type, String label) {
    this.momentType = type;
    this.label = label;
  }

  public String getMomentType() {
    return momentType;
  }

  public String getLabel() {
    return label;
  }

  public static Map<String, String> getValues() {
    final HashMap<String, String> map = new HashMap<String, String>();
    for (MomentType mon : values()) {
      map.put(mon.name(), mon.label);
    }
    return map;
  }

  @Override
  public String toString() {
    return this.label;
  }
}
