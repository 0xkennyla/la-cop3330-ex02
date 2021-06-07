/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny La
 */
package org.example;
import java.util.Scanner;

public class Exercise02 {
    public static void main (String []args)
    {
        System.out.println("What is the input string?");

        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        int count = input.length();

        System.out.println(input + " has " + count + " characters.");
    }
}
