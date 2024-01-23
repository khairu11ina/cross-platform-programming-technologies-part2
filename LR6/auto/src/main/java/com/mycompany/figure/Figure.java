package com.mycompany.figure;

import java.util.HashMap;

public abstract class Figure {

  // Dictionary of colors and codes
  public static final HashMap<String, String> colors = new HashMap<>();

  static {
    colors.put("Default", "\u001B[0m");
    colors.put("Black", "\u001B[40m");
    colors.put("Red", "\u001B[41m");
    colors.put("Green", "\u001B[42m");
    colors.put("Yellow", "\u001B[43m");
    colors.put("Blue", "\u001B[44m");
    colors.put("Purple", "\u001B[45m");
    colors.put("Cyan", "\u001B[46m");
    colors.put("White", "\u001B[47m");
  }

  public static String colorToCodeStyle(String color) {
    if (colors.get(color) == null) return colors.get("Default");
    return colors.get(color);
  }

  public final double PI = 3.14159265359;

  public String name = "Figure";

  abstract double area();
}
