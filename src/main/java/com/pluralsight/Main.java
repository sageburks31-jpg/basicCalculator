package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner=new Scanner(System.in);
    static List<Double> inputList= new ArrayList<>();
    static List<String> oprSymbollist=new ArrayList<>();
    static int symbolKey=0;

    public static void main(String[] args) {
        oprSymbollist.add(" + ");
        oprSymbollist.add(" - ");
        oprSymbollist.add(" * ");
        oprSymbollist.add(" / ");

        System.out.print("Enter the first number:");
        int firNum=scanner.nextInt();
        numInput(firNum);

        System.out.print("Enter the second number:");
        int secNum=scanner.nextInt();
        numInput(secNum);

        scanner.nextLine();
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please select an option:");

        String ans=scanner.nextLine();
        operate(ans);
    }

    public static void numInput(double num) {
        inputList.add(num);
    }

    static double result=0.0;

    public static void operate(String opr) {

        String lowerCase = opr.toLowerCase();

        switch (lowerCase) {
            case "a" -> {
                result = inputList.get(0) + inputList.get(1);
                symbolKey = 0;
            }
            case "s" -> {
                result = inputList.get(0) - inputList.get(1);
                symbolKey = 1;
            }
            case "m" -> {
                result = inputList.get(0) * inputList.get(1);
                symbolKey = 2;
            }
            case "d" -> {
                result = inputList.get(0) / inputList.get(1);
                symbolKey = 3;
            }
            case "r" -> {
                result = inputList.get(0) % inputList.get(1);
                symbolKey = 4;
            }
        }

        System.out.print(inputList.get(0));
        System.out.print(oprSymbollist.get(symbolKey));
        System.out.print(inputList.get(1)+" = "+result);

        inputList.clear();
        inputList.add(result);
    }
}