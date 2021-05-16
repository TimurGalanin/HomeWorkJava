package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);





    System.out.print("Введите количество гостей");

        int гости = input.nextInt();

        if (гости==2){
            System.out.println(1);
        }

         if (гости%2==0){
            System.out.println(гости/2);

        }
        else if (гости%2==1) {
            System.out.println(гости);
        }


    }



}