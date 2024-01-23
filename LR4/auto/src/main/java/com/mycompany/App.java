package com.mycompany;

import com.mycompany.auto.Auto;
import com.mycompany.auto.Car;
import com.mycompany.auto.GarageCar;
import com.mycompany.auto.Truck;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    task1();
    task2();
  }

  public static void task1() {
    Auto myAuto1 = new Auto();
    Scanner in = new Scanner(System.in);
    System.out.print("Введите фирму: ");

    String nazv = in.next();
    myAuto1.setFirm(nazv);
    System.out.print("Введите максимальную скорость: ");
    int s = in.nextInt();
    myAuto1.setMaxSpeed(s);
    System.out.print("Введите номер: ");
    String state = in.next();
    myAuto1.setStateNum(state);
    System.out.println(
      "Какой-то автомобиль: " +
      myAuto1.getFirm() +
      " " +
      myAuto1.getMaxSpeed() +
      " " +
      myAuto1.getStateNum()
    );
    System.out.println();
    Car myCar1 = new Car("Ford", 200, "AF214FC", "Mustang", 2, false);
    Car myCar2 = new Car();
    System.out.print("Введите фирму-производитель легкового авто: ");
    nazv = in.next();
    myCar2.setFirm(nazv);
    System.out.print("Введите максимальную скорость легкового авто: ");
    s = in.nextInt();
    myCar2.setMaxSpeed(s);
    System.out.print("Введите номер: ");
    state = in.next();
    myCar2.setStateNum(state);
    System.out.print("Введите модель легкового авто: ");
    nazv = in.next();
    myCar2.setModel(nazv);
    System.out.print("Введите кол-во дверей легкового авто: ");
    s = in.nextInt();
    myCar2.setNumDoors(s);
    System.out.print(
      "Введите признак полного привода легкового авто (true/false): "
    );

    Boolean f = in.nextBoolean();
    myCar2.setFullTime(f);
    System.out.println();
    System.out.println("Первый легковой автомобиль: " + myCar1.toString());
    System.out.println("Второй легковой автомобиль: " + myCar2.toString());
    Truck myTruck = new Truck();
    myTruck.setAllInfo();
    System.out.println(myTruck.toString());
  }

  public static void task2() {
    GarageCar myGarage = new GarageCar(); //создаем новый гараж
    Car myCar1 = new Car("Ford", 200, "HG124IO", "Mustang", 2, false);
    //создаем легковую машину
    myGarage.addCar(myCar1); // добавляем ее в гараж
    myGarage.addCar(new Car("LADA", 140, "FR432FF", "Kalina", 4, false)); //добавляем еще одну машину
    Truck myTruck = new Truck("Dove", 160, "TG454IO", "DTS", 700, true); //создаем грузовик

    myGarage.addCar(myTruck); //добавляем его в гараж
    myGarage.printGarage(); //выводи на экран содержимое гаража
    if (myGarage.findCar(myCar1)) { //ищем машину
      System.out.println("Да");
    } else {
      System.out.println("Нет");
    }
  }
}
