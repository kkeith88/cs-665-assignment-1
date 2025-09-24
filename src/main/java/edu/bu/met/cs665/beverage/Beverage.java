/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/21/2025
 * File Name: Beverage.java
 * Description: Abstract class representing a beverage
 * This class serves as a blueprint for different types of beverages.
 */

package edu.bu.met.cs665.beverage;

public abstract class Beverage {
    private static final int MAX_UNITS = 3;
    protected String name;
    protected double price; 
    private int milkUnits;
    private int sugarUnits;

    /**
     * Get the name of the beverage
     * @param none
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Get the milk units of the beverage
     * @param none
     * @return
     */
    public int getMilkUnits() {
        return milkUnits;
    }

    /**
     * Get the sugar units of the beverage
     * @param none
     * @return
     */
    public int getSugarUnits() {
        return sugarUnits;
    }

    /**
     * Get the price of the beverage
     * @param none
     * @return double price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Adds milk units to the beverage and calculates the new price
     * @param int milkUnits
     * @returns void
     */
    public void addMilk(int milkUnits) {
        //Check if adding units is valid, cannot be neg or more than MAX_UNITS total
        if (milkUnits < 0) {
            System.out.println("Cannot add negative units of milk.");
            return;
        }
        
        if (this.milkUnits + milkUnits > MAX_UNITS) {
            System.out.println("Cannot add more than a total of " + MAX_UNITS + " units of milk.");
            this.milkUnits = MAX_UNITS; // Set to max if exceeded
            calculatePrice();
            return;
        }
        this.milkUnits += milkUnits;
        calculatePrice();
    }

    /**
     * Adds sugar units to the beverage and calculates the new price
     * @param int sugarUnits
     * @returns void
     */
    public void addSugar(int sugarUnits) {
        //Check if adding units is valid, cannot be more than MAX_UNITS total
        if (sugarUnits < 0) {
            System.out.println("Cannot add negative units of sugar.");
            return;
        }
        
        if (this.sugarUnits + sugarUnits > MAX_UNITS) {
            System.out.println("Cannot add more than a total of " + MAX_UNITS + " units of sugar.");
            this.sugarUnits = MAX_UNITS; // Set to max if exceeded
            calculatePrice();
            return;
        }
        this.sugarUnits += sugarUnits;
        calculatePrice();
    }

    /**
     * Helper function, calculates the total price based on base price, milk units, and sugar units
     * @param none
     * @returns void
     */
    private void calculatePrice() {
        // Base price + 0.5 per milk unit + 0.5 per sugar unit
        double basePrice = getBasePrice();
        this.price = basePrice + (0.5 * this.milkUnits) + (0.5 * this.sugarUnits);
    }

    // Abstract method for subclasses to provide their base price
    protected abstract double getBasePrice();

    /**
     * Provides a description of the order including name, price, milk units, and sugar units
     * The idea is that this function is shown on the vending machine before a user confirms their order
     * @param none
     * @return String
     */
    public String getOrderDescription() {
        return "Beverage: " + name + ", Price: " + price + ", Milk Units: " + milkUnits + 
            ", Sugar Units: " + sugarUnits;
    }

    /**
     * Dispenses the drink with current customizations
     * This function is called after the user confirms their order, and message is displayed
     * on the screen of the vending machine
     * @param none
     * @return String
     */
    public String dispenseDrink(){
        return "Dispensing your " + name + " with " + milkUnits + " units of milk and "
             + sugarUnits + " units of sugar. Enjoy!";
    }
}