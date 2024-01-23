package com.mycompany.auto;

/**
 *	@see Pupils
 *	@author Alina
 *	Класс описывающий школьника
 */
public class SchoolBoy extends Pupils {

  /**
   *	Поле класса
   */
  private int grade;

  /**
   *	Конструктор без параметров
   *	@see Pupils
   */

  public SchoolBoy() {
    super();
    grade = 0;
  }

  /**
   *	Коструктор с параметрами
   *	@see Pupils
   *	@param Name
   *	@param Age
   *	@param Sex
   *	@param Grade
   */
  public SchoolBoy(String Name, int Age, String Sex, int Grade) {
    super(Name, Age, Sex);
    grade = Grade;
  }

  /**
   *	Метод определения класса
   *	@param Grade
   */
  public void setGrade(int Grade) {
    grade = Grade;
  }

  /**
   *	Метод получения значения класса
   *	@return
   */

  public int getGrade() {
    return grade;
  }

  /**
   *	Метод перевода данных в строку
   *	@return
   */
  public String toString() {
    return getName() + " " + getAge() + " " + getSex() + " " + grade;
  }
}
