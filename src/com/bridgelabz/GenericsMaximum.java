package com.bridgelabz;

public class GenericsMaximum {

    public static int maximum(Integer x, Integer y, Integer z){
        Integer max = x;
        if (y.compareTo(max) > 0)
            max = y;
          if (z.compareTo(max)>0)
            max = z;
        return max;
    }

    public static void main(String[] args) {
       //Integer[] intArray = {3,5,6};
        System.out.println(maximum(2,6,8));
    }
}
