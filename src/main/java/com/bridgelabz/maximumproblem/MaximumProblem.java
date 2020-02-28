package com.bridgelabz.maximumproblem;

import java.util.Arrays;
import java.util.Collections;

public class MaximumProblem <E extends Comparable<E>>{

    E a;
    E b;
    E c;

    public MaximumProblem(E a, E b, E c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public E checkMaximumNumber(){
        return checkMaximumNumber(a,b,c);
    }

    @SafeVarargs
    public static <E extends Comparable<E>> E checkMaximumNumber(E a,E b, E c,E...optionalArguments) {
        E max=a;
        if(max.compareTo(b)<0)
            max=b;
        if(max.compareTo(c)<0)
            max=c;
        if(optionalArguments.length!=0)
        {
            Arrays.sort(optionalArguments, Collections.reverseOrder());
            if(max.compareTo(optionalArguments[0])<0)
            {
                max=optionalArguments[0];
            }
        }
        return max;
    }
}