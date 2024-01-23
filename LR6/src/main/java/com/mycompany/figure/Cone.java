package com.mycompany.figure;

/**
 *
 *	@author 1
 */
public class Cone extends Figure implements Color, Print {

  private double r;
  private double h;
  private String color;

  public Cone(double r, double h) {
    this.name = "Cone";
    this.r = r;
    this.h = h;
    this.color = "Purple";
  }

  public Cone(double r, double h, String color) {
    this.name = "Cone";
    this.r = r;
    this.h = h;
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void print() {
    System.out.println("Area of Cone is " + area());
    System.out.println("Volume of Cone is " + volume());
    System.out.println("Base of Cone is " + base());
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

  public void setH(double h) {
    this.h = h;
  }

  public void setR(double r) {
    this.r = r;
  }

  double base() {
    return 2 * PI * r;
  }

  double area() {
    return PI * r * h;
  }

  double volume() {
    return (PI * r * r * h) / 3;
  }
}
