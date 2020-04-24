package com.company.week_3_1;

public class Task1 {

    public static void main(String[] args) {
        int a;
        int b;
        System.out.println("a\tb\ta AND b\ta OR b\ta XOR b");
        a = 1;
        b = 2;
        // 'a' is '1' or '01' in binary format
        // 'b' is '2' or '10' in binary format
        // 'a&b' is a bitwise AND, hence '01'&'10' is equivalent to '00':
        //  - first bit of 'a' is '0'; first bit of 'b' is '1'; '0'&'1' gives '0'; hence the first bit of the 'a'&'b' is '0'
        //  - second bit of 'a' is '1'; second bit of 'b' is '0'; '0'&'1' gives '0'; hence the second bit of the 'a'&'b' is '0'
        // other operations work in a similar way:
        //  - 'a'|'b' is a bitwise OR, hence '01'|'10' gives '11', which is 3 in decimal format;
        //  - 'a'^'b' is a bitwise XOR, hence '01'^'10' gives '11', which is 3 in decimal format.
        System.out.print(a + "\t" + b +"\t");
        System.out.print((a&b) + "\t\t" + (a|b) + "\t\t");
        System.out.println((a^b));
    }

}
