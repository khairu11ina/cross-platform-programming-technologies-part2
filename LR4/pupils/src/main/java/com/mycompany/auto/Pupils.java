package com.mycompany.auto;

/**
*	Класс описывающий учащихся
*	@author Alina
 
*/
public class Pupils {

  /**Поле имени */private String name;
  /**Поле возраста */private int age;
  /**Поле пола */private String sex;

  /**
   *	Конструктор без параметров
   */
  public Pupils() {
    name = "";
    age = 0;
    sex = "";
  }

  /**
   *	Конструктор с параметрами
   *	@param Name
   *	@param Age
   *	@param Sex
   */
  public Pupils(String Name, int Age, String Sex) {
    name = Name;
    age = Age;
    sex = Sex;
  }

  /**
   *	Функция определения имени
   *	@param Name
   */
  public void setName(String Name) {
    name = Name;
  }

  /**
   *	Функция определения возраста
   *	@param Age
   */
  public void setAge(int Age) {
    age = Age;
  }

  /**
   *	Функция определения пола
   *	@param Sex
   */
  public void setSex(String Sex) {
    sex = Sex;
  }

  /**
   *	Функуия получения значения возраста
   *	@return
   */
  public int getAge() {
    return age;
  }

  /**
   *	Функуия получения значения имени
   *	@return
   */
  public String getName() {
    return name;
  }

  /**
   *	Функуия получения значения пола
   *	@return
   */
  public String getSex() {
    return sex;
  }
}
