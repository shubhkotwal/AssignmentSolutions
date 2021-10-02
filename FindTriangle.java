package com.company;
import java.util.*;
import java.io.*;

public class FindTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Triangle Angle Values: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int ans=x+y+z;
        if(ans==180){
            System.out.println("It is a Triangle.");
        }
        else {
            System.out.println("It is not a Triangle.");
        }
    }
}
