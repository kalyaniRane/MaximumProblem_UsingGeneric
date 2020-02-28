package com.bridgelabz.maximumproblem;

public class MaximumProblem {

    public <E extends Comparable> E checkMaximumNumber(E num1, E num2, E num3) {
        E max=num1;
        if(max.compareTo(num2)<0)
            max=num2;
        if(max.compareTo(num3)<0)
            max=num3;
        return max;
    }

}
