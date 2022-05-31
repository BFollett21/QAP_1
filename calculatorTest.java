package com.keyin.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class calculatorTest {
private calculator calculatorUnderTest = new calculator();
    
@Test
    public void testAdd(){
    Assertions.assertEquals(10, calculatorUnderTest.add(6,4));
    Assertions.assertEquals(50, calculatorUnderTest.add(41,9));
    Assertions.assertNotEquals(98, calculatorUnderTest.add(62,37));
}

@Test
    public void testDifference(){
    Assertions.assertEquals(19, calculatorUnderTest.difference(27,8));
    Assertions.assertEquals(42, calculatorUnderTest.difference(66,24));
    Assertions.assertNotEquals(90, calculatorUnderTest.difference(104,28));
}

@Test
    public void testProduct(){
    Assertions.assertEquals(32, calculatorUnderTest.product(16,2));
    Assertions.assertEquals(84, calculatorUnderTest.product(21,4));
    Assertions.assertNotEquals(75, calculatorUnderTest.product(10,10));
}

}