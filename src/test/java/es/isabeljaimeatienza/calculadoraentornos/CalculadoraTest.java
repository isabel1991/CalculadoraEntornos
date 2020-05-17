/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.isabeljaimeatienza.calculadoraentornos;

import static java.lang.Float.NaN;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author cadit
 */
public class CalculadoraTest {
    
    @Test
    public void testSuma() {
        System.out.println("suma");
        double a = 5.0;
        Calculadora calc = new Calculadora();
        double expectedResult = calc.ans() + a;
        double result = calc.suma(a);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testResta() {
        System.out.println("resta");
        double a = 5.0;
        Calculadora calc = new Calculadora();
        double expectedResult = calc.ans() - a;
        double result = calc.resta(a);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testDivide() {
        System.out.println("divide");
        double a = NaN;
        Calculadora calc = new Calculadora();
        double expectedResult = calc.ans() / a;
        double result = calc.divide(a);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        double a = 0.0;
        Calculadora calc = new Calculadora();
        double expectedResult = calc.ans() * a;
        double result = calc.multiplica(a);
        assertEquals(expectedResult, result);
    }

    /**
     * Test of main method, of class Calculadora.
     */
    @Test
    public void testMain() {

    }

}
