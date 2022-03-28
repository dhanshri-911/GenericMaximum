package com.bridgelabz;

public class FindMaximumGenerics {

    public static <T extends Comparable<T>>  T maximum(T x, T y, T z){
        T max = x; // assume x is max
        if (y.compareTo(max) > 0)
            max = y;
          if (z.compareTo(max)>0)
            max = z;
        return max;
    }
    public static void main(String[] args) {
       //Integer[] intArray = {3,5,6};
        System.out.println(maximum(2,6,8));
        System.out.println(maximum(2.5f,6.8f,8.8f));
        System.out.println(maximum("Apple","Pear","Mango"));

    }
}
