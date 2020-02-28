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

}
