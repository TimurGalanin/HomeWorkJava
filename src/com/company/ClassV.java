package com.company;
import java.util.Scanner;
public class ClassV {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int countOfRaven;

        System.out.print("сколько птиц: ");
        countOfRaven = input.nextInt();

        int lastDigit = countOfRaven % 10;
        int penultDigit = countOfRaven % 100 / 10;

        if (penultDigit == 1) {
            System.out.println("Ворон");
        }
        else {

            switch (lastDigit) {
                case 1:
                    System.out.print("Ворона");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.print("Вороны");
                    break;
                default:
                    System.out.print("Ворон");
                    break;
            }
        }
    }
}

