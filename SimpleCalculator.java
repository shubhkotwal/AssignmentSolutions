package com.company;
import java.util.*;
import java.io.*;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value 1: ");
        int x=sc.nextInt();
        System.out.print("\nEnter Value 2: ");
        int y=sc.nextInt();
        System.out.print("\n1. Addition\n2. Subtraction\n3. Multiplication\n4.Division\nEnter option from above list:");
        int op=sc.nextInt();
        if(op==1){
            int add=x+y;
            System.out.println("=-=-=-=-=-=-=-=-=\nAddition is: "+ add);
        }
        if(op==2){
            int sub=x-y;
            System.out.println("=-=-=-=-=-=-=-=-=\nSubtraction is: "+ sub);
        }
        if(op==3){
            int mul=x*y;
            System.out.println("=-=-=-=-=-=-=-=-=\nMultiplication is: "+ mul);
        }
        if(op==4){
            int div=x/y;
            System.out.println("=-=-=-=-=-=-=-=-=\nDivision is: "+ div);
        }
    }
}
