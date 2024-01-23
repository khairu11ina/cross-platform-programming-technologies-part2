package com.mycompany.figure;

import java.util.Scanner;

class SuperClass {

  private char operator;

  public void setOperator() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter operator (+, -, / or *): ");

    this.operator = sc.nextLine().charAt(0);
    System.out.println("Result: ");
    sc.close();
  }

  public char getOperaion() {
    return this.operator;
  }
}
