/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/21/2025
 * File Name: TestBeverage.java
 * Description: A test class for the Beverage class
 * Will do most tests with the concrete Espresso class
 * Since other beverages inherit from Beverage and have the same methods
 */

package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import edu.bu.met.cs665.beverage.*;

public class TestBeverage {
    
    public TestBeverage(){

    }
    /**
     * Test getName for espressor
     */
    @Test
    public void testGetNameForEspresso() {
        Espresso espresso = new Espresso();
        assertEquals("Espresso", espresso.getName());
    }

    /**
     * Test getPrice for espresso
     */
    @Test
    public void testGetPriceForEspresso() {
        Espresso espresso = new Espresso();
        assertEquals(2.0, espresso.getPrice(), 0.01);
    }
    
    /**
     * Test adding excess milk, over max units would set the units to max
     * and price should be updated accordingly
     */
    @Test
    public void testAddExcessMilk() {
        Espresso espresso = new Espresso();
        espresso.addMilk(4);
        assertEquals(3, espresso.getMilkUnits());
        assertEquals(3.5, espresso.getPrice(), 0.01);
    }

    /**
     * Test adding excess sugar, over max units would set the units to max
     * and price should be updated accordingly
     */
    @Test
    public void testAddExcessSugar() {
        Espresso espresso = new Espresso();
        espresso.addSugar(5);
        assertEquals(3, espresso.getSugarUnits());
        assertEquals(3.5, espresso.getPrice(), 0.01);
    }

    /**
     * Test adding valid milk units and check updated price
     */
    @Test
    public void testAddMilk() {
        Espresso espresso = new Espresso();
        espresso.addMilk(2);
        assertEquals(2, espresso.getMilkUnits());
        assertEquals(3, espresso.getPrice(), 0.01);
    }

    /**
     * Test adding valid sugar units and check updated price
     */
    @Test
    public void testAddSugar() {
        Espresso espresso = new Espresso();
        espresso.addSugar(3);
        assertEquals(3, espresso.getSugarUnits());
        assertEquals(3.5, espresso.getPrice(), 0.01);
    }

    /**
     * Test adding invalid milk unit, negative. Should not change units or price
     */
    @Test
    public void testAddInvalidMilk() {
        Espresso espresso = new Espresso();
        espresso.addMilk(-1);
        assertEquals(0, espresso.getMilkUnits());
        assertEquals(2.0, espresso.getPrice(), 0.01);
    }    

    /**
     * Test adding invalid sugar unit, negative. Should not change units or price
     */
    @Test
    public void testAddInvalidSugar() {
        Espresso espresso = new Espresso();
        espresso.addSugar(-2);
        assertEquals(0, espresso.getSugarUnits());
        assertEquals(2.0, espresso.getPrice(), 0.01);
    }

    /**
     * Test name and price for Americano, check object is instantiated correctly
     */
    @Test
    public void getNameAndPriceForAmericao(){
        Americano americano = new Americano();
        assertEquals("Americano", americano.getName());
        assertEquals(3, americano.getPrice(), 0.01);
    }
    
    /**
     * Test name and price for Latte, check object is instantiated correctly
     */
    @Test
    public void getNameAndPriceForLatte(){
        Latte latte = new Latte();
        assertEquals("Latte", latte.getName());
        assertEquals(4, latte.getPrice(), 0.01);
    }

    /**
     * Test name and price for Black Tea, check object is instantiated correctly
     */
    @Test
    public void getNameAndPriceForBlackTea(){
        BlackTea blackTea = new BlackTea();
        assertEquals("Black Tea", blackTea.getName());
        assertEquals(2.0, blackTea.getPrice(), 0.01);
    }
    
}
