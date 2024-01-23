package com.mycompany.auto;

import java.util.ArrayList;

/**
 *	@see Pupils
 *	@author Alina
 *	Класс описывающий конференцию
 */

public class Conference {

  /**
   * Массив учащихся на конференции
   */
  private ArrayList<Pupils> masPupils = new ArrayList<>();

  /**
   *	Конструктор без параметров
   */
  public Conference() {}

  /**
   *	Конструктор с параметрами
   *	@param n
   */
  public Conference(ArrayList<Pupils> n) {
    masPupils = n;
  }

  /**
   *	Метод добовления учащихся
   *	@param m
   */
  public void addPupils(Pupils m) {
    masPupils.add(m);
  }

  /**
*	Метод удаления учащихся
*	@param m
 
*/
  public void removePupils(Pupils m) {
    masPupils.remove(m);
  }

  /**
   *	Поиск учащихся
   *	@param m
   *	@return
   */
  public Boolean findPupil(Pupils m) {
    return masPupils.contains(m);
  }

  /**
   *	Метод проверки учащихся
   *	@param m
   */
  public void check(Pupils m) {
    for (Pupils a : masPupils) {
      if (a instanceof Student) System.out.println("Это студент"); else {
        System.out.println("Это школьник");
      }
    }
  }

  /**
   *	Метод печати списка
   */
  public void print() {
    System.out.println("На конференции: ");
    for (Pupils a : masPupils) { //
      System.out.println("\t" + a.toString());
    }
  }
}
