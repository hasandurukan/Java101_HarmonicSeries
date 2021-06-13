package com.java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type a number :");

        double number = input.nextInt();
        double result = 0;

        while (number > 0) {
            result += (1 / number);
            number--;
        }

        System.out.println(result);
    }
}
