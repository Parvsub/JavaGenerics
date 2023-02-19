package com.javagenerics;

public class MaximumStringGenerics {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T Maximum = x;

        if (y.compareTo(Maximum) > 0)
            Maximum = y;

        if (z.compareTo(Maximum) > 0)
            Maximum = z;

        return Maximum;
    }

    public static void main(String args[]) {
        System.out.printf("Maximum of %s, %s and %s is %s\n\n", "Apple", "Peach", "Banana", maximum("Apple",
                "Peach", "Banana"));
    }
}
