package com.mycompany.figure;

/**
 *
 *	@author 1
 */
public class SubClass extends SuperClass implements Print {

  private Figure a;
  private Figure b;

  // set figures

  public void setFigures(Figure a, Figure b) {
    this.a = a;

    this.b = b;
  }

  @Override
  public void print() {
    System.out.println("Figure a: " + a.area());
    System.out.println("Figure b: " + b.area());
    setOperator();
    switch (getOperaion()) {
      case '+' -> System.out.println("Answer: " + (a.area() + b.area()));
      case '-' -> System.out.println("Answer: " + (a.area() - b.area()));
      case '/' -> System.out.println("Answer: " + (a.area() / b.area()));
      case '*' -> System.out.println("Answer: " + (a.area() * b.area()));
      default -> System.out.println("Wrong operator");
    }
  }
}
