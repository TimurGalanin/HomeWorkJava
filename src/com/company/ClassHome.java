package com.company;

import java.util.Scanner;

public class ClassHome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        int b;
        int c;
        int Raspberry;

        System.out.print(" собрала Маша ");
        a= input.nextInt();
        System.out.print(" собрал Миша ");
        b=input.nextInt();
        System.out.print(" Съели ");
        c= input.nextInt();


        Raspberry=a+b-c;
        System.out.println();



        if (a+b>c){
            System.out.print("Собрано ягод "+Raspberry);
        }

        else if (c>a+b){
            System.out.print("не может быть ");

        }

    }

}

