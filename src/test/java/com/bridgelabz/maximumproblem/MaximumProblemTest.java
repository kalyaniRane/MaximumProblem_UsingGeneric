package com.bridgelabz.maximumproblem;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProblemTest {

    @Test
    public void givenMaxNumberAt1stPosition_ShouldReturnSameIntegerNumber() {
        MaximumProblem maximumProblem = new MaximumProblem(3,2,1);
        Integer integer = (Integer) maximumProblem.checkMaximumNumber();
        Assert.assertEquals((Integer)3,integer);
    }

    @Test
    public void givenMaxNumberAt2ndPosition_ShouldReturnSameIntegerNumber() {
        MaximumProblem maximumProblem = new MaximumProblem(1, 3, 2);
        Integer integer = (Integer) maximumProblem.checkMaximumNumber();
        Assert.assertEquals((Integer)3,integer);
    }

    @Test
    public void givenMaxNumberAt3rdPosition_ShouldReturnSameIntegerNumber() {
        MaximumProblem maximumProblem = new MaximumProblem(2, 1, 3);
        Integer integer = (Integer) maximumProblem.checkMaximumNumber();
        Assert.assertEquals((Integer)3,integer);
    }

    @Test
    public void givenMaxNumberAt1stPosition_ShouldReturnSameFloatNumber() {
        MaximumProblem maximumProblem = new MaximumProblem(3.50f, 2.20f, 1.00f);
        Float aFloat = (Float) maximumProblem.checkMaximumNumber();
        Assert.assertEquals(3.50f,aFloat,0.00);
    }

    @Test
    public void givenMaxNumberAt2ndPosition_ShouldReturnSameFloatNumber() {
        MaximumProblem maximumProblem = new MaximumProblem(2.20f, 3.50f, 1.00f);
        Float aFloat = (Float) maximumProblem.checkMaximumNumber();
        Assert.assertEquals(3.50f,aFloat,0.00);
    }

    @Test
    public void givenMaxNumberAt3rdPosition_ShouldReturnSameFloatNumber() {
        MaximumProblem maximumProblem = new MaximumProblem(2.20f, 1.00f, 3.50f);
        Float aFloat = (Float) maximumProblem.checkMaximumNumber();
        Assert.assertEquals(3.50f,aFloat,0.00);
    }

    @Test
    public void givenMaxStringAt1stPosition_ShouldReturnSameString() {
        MaximumProblem maximumProblem = new MaximumProblem("Peach", "Apple", "Banana");
        String string = (String) maximumProblem.checkMaximumNumber();
        Assert.assertEquals("Peach",string);
    }

    @Test
    public void givenMaxStringAt2ndPosition_ShouldReturnSameString() {
        MaximumProblem maximumProblem = new MaximumProblem("Apple", "Peach", "Banana");
        String string = (String) maximumProblem.checkMaximumNumber();
        Assert.assertEquals("Peach",string);
    }

    @Test
    public void givenMaxStringAt3rdPosition_ShouldReturnSameString() {
        MaximumProblem maximumProblem = new MaximumProblem("Apple", "Banana", "Peach");
        String string = (String) maximumProblem.checkMaximumNumber();
        Assert.assertEquals("Peach",string);
    }
}
