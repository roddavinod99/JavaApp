package com.Internshala.javaapp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum= 0;
        int[][] myFirst2DArray = {
                { 3, 5, 1, 9 },
                { 10, 15, 3, 0  },
                { 1, 11, 31, 90 },
                { 2, 51, 1, 9 }
        };

        for (int row = 0; row < myFirst2DArray.length; row++) {

            for (int column = 0; column < myFirst2DArray[row].length; column++) {
                sum= sum+ myFirst2DArray[row][column];
                System.out.print(myFirst2DArray[row][column] + " ");
            }

            System.out.println();
        }System.out.println("sum of all Elements is : " +sum);

    }

}





