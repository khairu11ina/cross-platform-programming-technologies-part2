package com.mycompany;

import com.mycompany.figure.Cone;
import com.mycompany.figure.Figure;
import com.mycompany.figure.Print;
import com.mycompany.figure.Sphere;
import com.mycompany.figure.Square;
import com.mycompany.figure.SubClass;

public class App {

  public static void main(String[] args) {
    Figure f;
    f = new Sphere(5, "Black");
    ((Sphere) f).setR(2);
    ((Print) f).print();

    f = new Cone(7, 4, "Purple");
    ((Cone) f).setR(5);
    ((Cone) f).setH(8);
    ((Print) f).print();

    f = new Square(3, 9, "Red");
    ((Square) f).setA(3);
    ((Print) f).print();

    SubClass s;
    s = new SubClass();
    s.setFigures(new Square(8), new Cone(4, 3));

    s.print();
  }
}
