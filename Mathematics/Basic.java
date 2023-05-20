package Mathematics;

import java.util.Scanner;
public class Basic {
    Scanner FuserInput = new Scanner(System.in);
    Scanner SuserInput = new Scanner(System.in);

    double first_num;
    double second_num;
    public void Add() {
        System.out.println("Welcome to the the addition calculation. \nPlease enter two numbers(for now) that you wanna add together");
        System.out.print(" 1st number: ");
        first_num = Double.valueOf(FuserInput.nextLine());
        System.out.print("2nd Number: ");
        second_num = Double.valueOf(SuserInput.nextLine());

        double result = first_num + second_num;
        System.out.println("The value of " + first_num + " + " + second_num + " is " + result);
    }

    public void Subtract() {
        System.out.println("Welcome to the the subtract calculation. \nPlease enter two numbers(for now) that you wanna subtract");
        System.out.print(" 1st number: ");
        first_num = Double.valueOf(FuserInput.nextLine());
        System.out.print("2nd Number: ");
        second_num = Double.valueOf(SuserInput.nextLine());

        double result = first_num - second_num;
        System.out.println("The value of " + first_num + " - " + second_num + " is " + result);
    }
}
