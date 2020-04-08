package com.company.week_3_1;

public class Task1 {

    public static void main(String[] args) {
        boolean a;
        boolean b;
        System.out.println("a\tb\ta AND b\ta OR b\ta XOR b\ta NOT b");
        a = true;
        b = true;
        System.out.print(a + "\t" + b +"\t");
        System.out.print((a&b) + "\t" + (a|b) + "\t");
        System.out.println((a^b) + "\t" + (!b));
        a = true;
        b = false;
        System.out.print(a + "\t" + b +"\t");
        System.out.print((a&b) + "\t" + (a|b) + "\t");
        System.out.println((a^b) + "\t" + (!b));
        a = false;
        b = true;
        System.out.print(a + "\t" + b +"\t");
        System.out.print((a&b) + "\t" + (a|b) + "\t");
        System.out.println((a^b) + "\t" + (!b));
        a = false;
        b = false;
        System.out.print(a + "\t" + b +"\t");
        System.out.print((a&b) + "\t" + (a|b) + "\t");
        System.out.println((a^b) + "\t" + (!b));
    }

}
