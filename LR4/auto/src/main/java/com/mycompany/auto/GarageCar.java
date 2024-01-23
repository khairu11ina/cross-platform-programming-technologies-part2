package com.mycompany.auto;

import java.util.ArrayList;

public class GarageCar {

  private ArrayList<Auto> masCar = new ArrayList<>(); //массив с машинами

  public GarageCar() {}

  public GarageCar(ArrayList<Auto> n) { //конструктор для внесения существующего списка машин
    //в гараж
    masCar = n;
  }

  public void addCar(Auto m) {} //метод для добавления машины в гараж masCar.add(m);

  public void removeCar(Auto m) {
    masCar.remove(m);
  }

  public Boolean findCar(Auto m) { //для выяснения – есть ли машина m в гараже
    return masCar.contains(m);
  }

  public void printGarage() { //для вывода на экран списка машин в гараже System.out.println("В гараже: ");
    for (Auto a : masCar) { // System.out.println("\t" + a.toString());
      if (a instanceof Car) {
        System.out.println("Это легковая машина");
      }
    }
  }
}
