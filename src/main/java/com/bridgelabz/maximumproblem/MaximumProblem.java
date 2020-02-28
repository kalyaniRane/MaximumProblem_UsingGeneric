package com.bridgelabz.maximumproblem;

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

    public static <E extends Comparable<E>> E checkMaximumNumber(E a,E b, E c) {
        E max=a;
        if(max.compareTo(b)<0)
            max=b;
        if(max.compareTo(c)<0)
            max=c;
        return max;
    }

}