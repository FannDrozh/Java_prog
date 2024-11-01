package Zadanie4;

import java.util.Random;
import java.util.Scanner;

public class Zadanie4
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 10;
        int num = 0;

        int[][] arr = new int[n][n];
        int[] B = new int[n];

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for(int j = 0; j<n; j++){
                arr[i][j] = random.nextInt(10 - -10 + 1) + -10;
                System.out.print(" " + arr[i][j]);
                if(arr[i][j]>= 0){
                    B[i] = ++num;
                }
            }
            num = 0;
            System.out.println();
        }
        System.out.println();
        for(int i = 0;i<n; i++){
            System.out.print(" " + B[i]);
        }
        in.close();
    }
}
