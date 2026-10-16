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
        numinput(firNum);

        System.out.print("Enter the second number:");
        int secNum=scanner.nextInt();
        numinput(secNum);

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

    public static double numinput(double num) {
        inputList.add(num);
        return num;
    }

    static double result=0.0;

    public static String operate(String opr) {

        String lowerCase = opr.toLowerCase();
        opr=lowerCase;

        if (opr.equals("a")){
            result=inputList.get(0)+inputList.get(1);
            symbolKey=0;

        } else if (opr =="s") {
            result=inputList.get(0)-inputList.get(1);
            symbolKey=1;

        } else if (opr =="m") {
            result=inputList.get(0)*inputList.get(1);
            symbolKey=2;

        } else if (opr =="d") {
            result=inputList.get(0)/inputList.get(1);
            symbolKey=3;

        } else if (opr =="r") {
            result=inputList.get(0)%inputList.get(1);
            symbolKey=4;

        }

        System.out.print(inputList.get(0));
        System.out.print(oprSymbollist.get(symbolKey));
        System.out.print(inputList.get(1)+" = "+result);

        inputList.clear();
        inputList.add(result);
        return String.valueOf((double) result);

    }


}