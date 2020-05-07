package com.company.week_3_1;

public class Task1 {

    public static void main(String[] args) {
        byte min_byte = Byte.MIN_VALUE;
        byte max_byte = Byte.MAX_VALUE;

        System.out.println("A byte has values from "+min_byte+" to "+max_byte);

        short min_short = Short.MIN_VALUE;
        short max_short = Short.MAX_VALUE;

        System.out.println("A short has values from "+min_short+" to "+max_short);

        char min_char = Character.MIN_VALUE;
        char max_char = Character.MAX_VALUE;

        // this output will give us symbols, hence it's not really clear what actual values can it hold
        System.out.println("A char has character values from "+min_char+" to "+max_char);

        // this output will give us the decimal values, or ASCII codes.
        // When we write '(int)min_char' we convert the character to it's ASCII code, which is decimal.
        System.out.println("A char has decimal values from "+(int)min_char+" to "+(int)max_char);

        int min_int = Integer.MIN_VALUE;
        int max_int = Integer.MAX_VALUE;

        System.out.println("An integer has values from "+min_int+" to "+max_int);

        long min_long = Long.MIN_VALUE;
        long max_long = Long.MAX_VALUE;

        System.out.println("A long has values from "+min_long+" to "+max_long);

        float min_float = Float.MIN_VALUE;
        float max_float = Float.MAX_VALUE;

        System.out.println("A float has values from "+min_float+" to "+max_float);

        double min_double = Double.MIN_VALUE;
        double max_double = Double.MAX_VALUE;

        System.out.println("A double has values from "+min_double+" to "+max_double);
    }

}
