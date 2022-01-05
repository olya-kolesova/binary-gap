package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Print an integer");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        int max = 0;
        String numStr = Integer.toBinaryString(num);
        System.out.println(numStr);
        for (int i = 0; i <= numStr.length() - 1; i++) {
            if (numStr.charAt(i) == '0') {
                count += 1;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }

        System.out.println(max);
    }
}
