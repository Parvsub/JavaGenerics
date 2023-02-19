package com.javagenerics;

public class MaximumIntegerGenerics {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T Maximum = x;

        if (y.compareTo(Maximum) > 0)
            Maximum = y;

        if (z.compareTo(Maximum) > 0)
            Maximum = z;

        return Maximum;
    }

    public static void main(String args[]) {
        System.out.printf("Maximum of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));
    }
}
