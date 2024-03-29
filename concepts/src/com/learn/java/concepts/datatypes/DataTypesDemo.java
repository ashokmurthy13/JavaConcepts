package com.learn.java.concepts.datatypes;

public class DataTypesDemo {
    private static byte b;
    private static short s;
    private static int i;
    private static long l;
    private static float f;
    private static double d;
    private static boolean boo;
    private static char c;

    public static void main(String[] args) {

        short[] argss = new short[]{50, 50};
        argss[0] = 5;
        argss[1] = 10;
        System.out.println("[" + argss[0] + ", " + argss[1] + "]"); // [5, 10]


        System.out.println("default values");
        System.out.println("-------------------------------------------------");
        System.out.println("byte : " + b);
        System.out.println("short : " + s);
        System.out.println("int : " + i);
        System.out.println("long : " + l);
        System.out.println("float : " + f);
        System.out.println("double : " + d);
        System.out.println("boolean : " + boo);
        System.out.println("char : " + c);
        System.out.println();
        System.out.println("Max : Min Values");
        System.out.println("-------------------------------------------------");
        System.out.println("byte    -> " + Byte.MAX_VALUE + " : " + Byte.MIN_VALUE);
        System.out.println("short   -> " + Short.MAX_VALUE + " : " + Short.MIN_VALUE);
        System.out.println("int     -> " + Integer.MAX_VALUE + " : " + Integer.MIN_VALUE);
        System.out.println("long    -> " + Long.MAX_VALUE + " : " + Long.MIN_VALUE);
        System.out.println("float   -> " + Float.MAX_VALUE + " : " + Float.MIN_VALUE);
        System.out.println("double  -> " + Double.MAX_VALUE + " : " + Double.MIN_VALUE);
        System.out.println("boolean -> " + Boolean.TRUE + " : " + Boolean.FALSE);
        System.out.println("char    -> " + Character.MAX_VALUE + " : " + Character.MIN_VALUE);
        System.out.println();

        /**
         * byte    -> 127 : -128
         * short   -> 32767 : -32768
         * int     -> 2147483647 : -2147483648
         * long    -> 9223372036854775807 : -9223372036854775808
         * float   -> 3.4028235E38 : 1.4E-45
         * double  -> 1.7976931348623157E308 : 4.9E-324
         * boolean -> true : false
         * char    -> ￿ :  
         */
        primitiveOperations();
    }

    static void primitiveOperations() {

        int i = Integer.MAX_VALUE;
        int j = i;
        System.out.println(i + " : " + (j + 1)); // rolls over to the minimum value, and begins counting up from there

        double d = Double.MAX_VALUE;
        double e = d + 1; // infinity
        System.out.println(d + " : " + e);

        int[] intArr = {2, 1, 0};
        for (int a : intArr) {
            System.out.println(intArr[a]);
        }
    }
}
