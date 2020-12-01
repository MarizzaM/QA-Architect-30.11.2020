package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String my_name;
        Scanner str = new Scanner(System.in);
        System.out.println("Please enter your name");
        my_name = str.nextLine();

        int my_savings = 0;
        my_savings += 10000;
        my_savings *= 2;
        my_savings += 30000;
        my_savings ++;
        my_savings /= 2;

        System.out.println(my_name+" has saving "+my_savings);

    }
}
//Vasya Pupkin has saving 25000
//Bill Gates has saving 125000
