/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/21/2025
 * File Name: Main.java
 * Description: Entry point for the application
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.beverage.*;

/**
 * This is the Main class.
 */
public class Main {


  public static void main(String[] args) {
    System.out.println("This is a test message from the Main class (Main.java file)");
    Espresso espresso = new Espresso();
    System.out.println(espresso.getOrderDescription());
    espresso.addMilk(2);
    System.out.println(espresso.getOrderDescription());
    espresso.addSugar(1);
    System.out.println(espresso.getOrderDescription());
    espresso.addMilk(2);
    System.out.println(espresso.getOrderDescription());

    Americano a = new Americano();
    System.out.println(a.getOrderDescription());
    a.addSugar(3);
    System.out.println(a.getOrderDescription());
  }

}
