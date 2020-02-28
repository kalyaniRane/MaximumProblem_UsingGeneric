package com.bridgelabz.maximumproblem;

public class MaximumProblem {

    public Integer checkMaximumNumber(Integer num1, Integer num2, Integer num3) {
        Integer max=num1;
        if(max.compareTo(num2)<0)
            max=num2;
        if(max.compareTo(num3)<0)
            max=num3;
        return max;
    }

    public Float checkMaximumFloatNumber(Float num1, Float num2, Float num3) {
        Float max=num1;
        if(max.compareTo(num2)<0)
            max=num2;
        if(max.compareTo(num3)<0)
            max=num3;
        return max;
    }
}
