package com.mycompany.auto;

public class Auto {

  private String firm; //создаем закрытый член нашего класса с названием фирмы автомобиля
  private int maxSpeed; // закрытый член класса, содержащий максимальную скорость
  private String stateNum;

  public Auto() { // конструктор класса (без параметров) firm = "Без названия";
    maxSpeed = 0;
    stateNum = "";
  }

  public Auto(String firma, int speed, String state) { //конструктор класса (с параметрами)
    firm = firma;
    maxSpeed = speed;
    stateNum = state;
  }

  public void setFirm(String firma) { //открытая функция (метод класса) для задания
    firm = firma; //значения фирмы автомобиля
  }

  public void setMaxSpeed(int speed) { //открытая функция (метод класса) для задания
    maxSpeed = speed; //значения максимальной скорости автомобиля
  }

  public void setStateNum(String state) {
    stateNum = state;
  }

  public int getMaxSpeed() { //открытая функция (метод класса) для вывода значения
    return maxSpeed; //максимальной скорости
  }

  public String getFirm() { //открытая функция (метод класса) для вывода значения
    return firm; //заданной фирмы
  }

  public String getStateNum() {
    return stateNum;
  }
}
