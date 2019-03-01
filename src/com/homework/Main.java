package com.homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        int rem, sum = 0, x;

        System.out.println("Please enter a number: ");
        int number = new Scanner(System.in).nextInt();
        x = number;

        while (number !=0) {
            rem = number % 10;
            number = number / 10;
            sum = sum + (rem*rem*rem);
        }

        if (x <= 0){
            throw new Exception("Please enter a number which is higher than zero!");
        }else if (sum == x){
            System.out.println(x + " is an amstrong number.");
        }else {
            System.out.println(x + " is not an amstrong number.");
        }


    }
}
