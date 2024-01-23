package com.mycompany;

import com.mycompany.auto.Conference;
import com.mycompany.auto.Pupils;
import com.mycompany.auto.Student;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    task1();
    task2();
  }

  public static void task1() {
    Pupils pupils = new Pupils();
    Scanner in = new Scanner(System.in);
    System.out.print("Введите возраст: ");
    int age = in.nextInt();
    pupils.setAge(age);
    System.out.print("Введите имя: ");
    String name = in.next();
    pupils.setName(name);
    System.out.print("Введите пол: ");

    String sex = in.next();
    pupils.setSex(sex);
    System.out.print(
      "Учащийся " +
      pupils.getName() +
      " " +
      pupils.getSex() +
      " " +
      pupils.getAge() +
      "\n"
    );
    Student student1 = new Student("Jax", 10, "men", "programmer \n\n");
    System.out.print(
      "Студент " +
      student1.getName() +
      " " +
      student1.getAge() +
      " " +
      student1.getSex() +
      " " +
      student1.getProfession()
    );
  }

  public static void task2() {
    Conference conf = new Conference();
    Student student1 = new Student("Jax", 18, "men", "programmer");
    Student student2 = new Student("Tom", 21, "men", "programmer");
    conf.addPupils(student1);
    conf.addPupils(student2);
    conf.print();

    conf.check(student1);
  }
}
