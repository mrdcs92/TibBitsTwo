package com.dylan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Switch
        int switchValue = 3;
        switch (switchValue){
            case 1:
                System.out.println("Hi");
                break;

            case 2:
                System.out.println("hello");
                break;

            case 3: case 4: case 5:
                System.out.println("yolanda");

            default:
                System.out.println("just");
                break;

        }

        // while & do while
        do {
            // do this at least once
        } while (//)

        sumOdd(1, 11);

        // parsing from strings
        int number = Integer.parseInt("9");

        // reading input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int yearOfBirth = scanner.nextInt();
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close();
    }

    public static void printNumberInWord(int number){
        switch (number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static boolean isOdd(int number){
        if (number < 0 || number % 2 == 0){
            return false;
        } else {
            return true;
        }
    }

    public static void sumOdd(int start, int end){
        int sum = 0;
        if(end >= start && start > 0 && end > 0){
            for (int i = start; i < end + 1; i++){
                if (isOdd(i)){
                    sum += i;
                }
            }
        } else {
            sum = -1;
        }

        System.out.println(sum);
    }


}
