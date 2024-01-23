package com.mycompany.figure;

public class Sphere extends Figure implements Color, Print {

  private double r;
  private String color;

  public Sphere(double r) {
    this.name = "Sphere";
    this.r = r;
    this.color = "Red";
  }

  public Sphere(double r, String color) {
    this.name = "Sphere";
    this.r = r;
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void print() {
    System.out.println("Area of Sphere is " + area());
    System.out.println("Volume of Sphere is " + volume());
    System.out.println("Diameter of Sphere is " + diameter());
    System.out.println(
      "Color of " +
      Figure.colorToCodeStyle(getColor()) +
      this.name +
      Figure.colors.get("Default") +
      " is " +
      getColor()
    );
    System.out.println();
  }

  public void setR(double r) {
    this.r = r;
  }

  double diameter() {
    return 2 * r;
  }

  double area() {
    return 4 * PI * r * r;
  }

  double volume() {
    return (4 * PI * r * r * r) / 3;
  }
}
