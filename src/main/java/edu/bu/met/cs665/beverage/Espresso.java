/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/21/2025
 * File Name: Espresso.java
 * Description: Represents an Espresso beverage.
 */

package edu.bu.met.cs665.beverage;

public class Espresso extends Beverage {
    
    public Espresso() {
        this.name = "Espresso";
        this.price = 2.0;
    }

    /**
     * Overrides getBasePrice method in Beverage class
     */
    @Override
    protected double getBasePrice() {
        return 2.0;
    }
}
