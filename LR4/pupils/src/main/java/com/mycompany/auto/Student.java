package com.mycompany.auto;

/**
 *	@see Pupils
 *	@author Alina
 *	Класс описывающий студента
 */
public class Student extends Pupils {

  /** Поле профессии*/private String profession;

  /**
   *	Конструктор без парамтров
   *	@see Pupils
   */
  public Student() {
    super();
    profession = "";
  }

  /**
   *	Конструктор с параметрами
   *	@see Pupils
   *	@param Name
   *	@param Age
   *	@param Sex
   *	@param Profession
   */
  public Student(String Name, int Age, String Sex, String Profession) {
    super(Name, Age, Sex);
    profession = Profession;
  }

  /**
   *	Метод определения профессии
   *	@param Profession
   */
  public void setProfession(String Profession) {
    profession = Profession;
  }

  /**
   *	Метод получения значения профессии
   *	@return
   */
  public String getProfession() {
    return profession;
  }

  /**
   *	Метод перевода данных в строку
   *	@return
   */

  public String toString() {
    return getName() + " " + getAge() + " " + getSex() + " " + profession;
  }
}
