package com.bridgelabz;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	int num1,num2,temp;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers");
    num1=sc.nextInt();
            num2=sc.nextInt();
        System.out.println("Before Swapping numbers are");
        System.out.println("Number 1 : "+num1);
        System.out.println("Number 2 : "+num2);
            temp=num1;
            num1=num2;
            num2=temp;
        System.out.println("After Swapping numbers are");
        System.out.println("Number 1 : "+num1);
        System.out.println("Number 2 : "+num2);
    }
}
