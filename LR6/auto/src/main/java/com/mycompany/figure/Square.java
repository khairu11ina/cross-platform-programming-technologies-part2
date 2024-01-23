package com.mycompany.figure;

/**
 *
 *	@author 1
 */
public class Square extends Figure implements Color, Print {

  private double a;
  private String color;

  public Square(double a) {
    this.name = "Square";
    this.a = a;
    this.color = "Green";
  }

  public Square(double a, double b, String color) {
    this.name = "Square";
    this.a = a;
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void print() {
    System.out.println("Area of Square is " + area());

    System.out.println("Perimeter of Square is " + perimeter());
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

  public void setA(double a) {
    this.a = a;
  }

  double area() {
    return a * a;
  }

  double perimeter() {
    return 4 * a;
  }
}
