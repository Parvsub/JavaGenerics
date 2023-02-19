package com.javagenerics;

public class MaximumFloatGenerics {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T Maximum = x;
        if (y.compareTo(Maximum) > 0)
            Maximum = y;
        if (z.compareTo(Maximum) > 0)
            Maximum = z;

        return Maximum;
    }

    public static void main(String args[]) {
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6,
                8.8, 7.7));
    }
}