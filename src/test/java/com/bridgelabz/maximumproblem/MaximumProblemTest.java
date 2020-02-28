package com.bridgelabz.maximumproblem;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProblemTest {

    @Test
    public void givenMaxNumberAt1stPosition_ShouldReturnSameIntegerNumber() {
        MaximumProblem maximumProblem = new MaximumProblem();
        Integer integer = maximumProblem.checkMaximumNumber(3, 2, 1);
        Assert.assertEquals((Integer)3,integer);
    }

    @Test
    public void givenMaxNumberAt2ndPosition_ShouldReturnSameIntegerNumber() {
        MaximumProblem maximumProblem = new MaximumProblem();
        Integer integer = maximumProblem.checkMaximumNumber(1, 3, 2);
        Assert.assertEquals((Integer)3,integer);
    }

    @Test
    public void givenMaxNumberAt3rdPosition_ShouldReturnSameIntegerNumber() {
        MaximumProblem maximumProblem = new MaximumProblem();
        Integer integer = maximumProblem.checkMaximumNumber(2, 1, 3);
        Assert.assertEquals((Integer)3,integer);
    }

    @Test
    public void givenMaxNumberAt1stPosition_ShouldReturnSameFloatNumber() {
        MaximumProblem maximumProblem = new MaximumProblem();
        Float aFloat = maximumProblem.checkMaximumFloatNumber(3.50f, 2.20f, 1.00f);
        Assert.assertEquals(3.50f,aFloat,0.00);
    }

    @Test
    public void givenMaxNumberAt2ndPosition_ShouldReturnSameFloatNumber() {
        MaximumProblem maximumProblem = new MaximumProblem();
        Float aFloat = maximumProblem.checkMaximumFloatNumber(2.20f, 3.50f, 1.00f);
        Assert.assertEquals(3.50f,aFloat,0.00);
    }

    @Test
    public void givenMaxNumberAt3rdPosition_ShouldReturnSameFloatNumber() {
        MaximumProblem maximumProblem = new MaximumProblem();
        Float aFloat = maximumProblem.checkMaximumFloatNumber(2.20f, 1.00f, 3.50f);
        Assert.assertEquals(3.50f,aFloat,0.00);
    }
}
