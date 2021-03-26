package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b;
        System.out.print("Hello! This is a simple console application, that reverses the line. Enter the line: ");
        a = sc.nextLine();
        b = new StringBuilder(a).reverse().toString();
        System.out.println("The result is: " + b);
    }
}
