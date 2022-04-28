


public class Task_2 {
    public static void main(String[] args) {
        final double PI = Math.PI;

        double b = PI/2;

        double dx = PI/20;

        for( double a = (PI/2) * - 1; a < b; a = a + dx ) {
            System.out.print("x = ");
            System.out.println(String.format("%.1f", a));
            System.out.println(" ************* ");
            double fx = (1/Math.tan(a)) - 2 * Math.sin(a);
            System.out.print("y = f(x) = ");
            System.out.println(String.format("%.1f", fx));
        }
    }
}






















//package com.company;
//
//public class Task_2 {
//    public static void main(String[] args) {
//        final double PI = Math.PI;
//
//        double b = PI/2;
//
//        double dx = PI/20;
//
//        try {
//            for (double a = (PI / 2) * -1; a < b; a = a + dx) {
//                System.out.print("x = ");
//                System.out.println(String.format("%.1f", a));
//                System.out.println(" ************* ");
//                double fx = (1 / Math.tan(a)) - 2 * Math.sin(a);
//                System.out.print("y = f(x) = ");
//                System.out.println(String.format("%.1f", fx));
//            }
//        } catch (ArithmeticException exception) {
//            System.out.println("ArithmeticException");
//        } catch (Exception exception) {
//            System.out.println("Exception");
//        }
//    }
//}
//
