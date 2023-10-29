package org.example;

public class FirstHomework {
    public int square(int a) {
        return a * a;
    }

    public double squareCircle(int r) {
        return r * r * Math.PI;
    }

    public double squareTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            int p = a + b + c;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return 0;
    }
}