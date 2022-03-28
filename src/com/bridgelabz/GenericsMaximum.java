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
    public static float floatMaximum(Float x,  Float y, Float z){
        Float max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max)>0)
            max = z;
        return max;
    }

    public static void main(String[] args) {
       //Integer[] intArray = {3,5,6};
        System.out.println(maximum(2,6,8));
        System.out.println(floatMaximum(2.5f,6.8f,8.8f));

    }
}
