//Austin Morris
//CS 301 Homework 5
package edu.cpp.austin.CS301_Homework5;

public class Main {

    public static void main(String[] args) {
	    exercise_5_1_2();
	    exercise_5_1_9();
    }

    private static void exercise_5_1_2() {
        System.out.println("Exercise 5.1 #2 (each approximation uses 10 equally spaced points)");
        double a = trapezoid_uniform('a', 0, Math.PI, 10);
        double aActual = (-1 * Math.cos(Math.PI)) - (-1 * Math.cos(0));
        double b = trapezoid_uniform('b', 0, 1, 10);
        double bActual = Math.pow(Math.E, 1) - Math.pow(Math.E, 0);
        double c = trapezoid_uniform('c', 0, 1, 10);
        double cActual = (Math.atan(1) - .5 * Math.log10(2)) - (0.5 * Math.log10(1));
        System.out.println("2a:");
        System.out.println("Approx: " + a);
        System.out.println("Actual: " + aActual);
        System.out.println("2b:");
        System.out.println("Approx: " +b);
        System.out.println("Actual: " + bActual);
        System.out.println("2c:");
        System.out.println("Approx: " +c);
        System.out.println("Actual: " + cActual);
    }

    private static void exercise_5_1_9() {
        System.out.println("\nExercise 5.1 #9");
        double d = trapezoid_uniform('d', 0, 1, 800);
        System.out.println(d);
    }

    private static double trapezoid_uniform(char f, double a, double b, int n) {
        double h = (b - a) / n;
        double sum = 0;
        for (int i = 1; i < n; i++) {
            sum += function(f, a + i * h);
        }
        return (h / 2) * (function(f, a) + function(f, b)) + h * sum;
    }

    private static double function(char f, double x) {
        switch (f) {
            case 'a':
                return Math.sin(x);
            case 'b':
                return Math.pow(Math.E, x);
            case 'c':
                return Math.atan(x);
            case 'd':
                return (x == 0) ? 1.0 : (Math.sin(x) / x);
            default:
                return -1;
        }
    }
}
