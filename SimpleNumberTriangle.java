package com.company;
import java.util.*;
import java.io.*;

public class SimpleNumberTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value Star Value: ");
        int x=sc.nextInt();
        for(int i=0; i<x; i++) {
            for (int j=0; j<i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
