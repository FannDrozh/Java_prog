package Zadanie3;
import java.util.Random;
import java.util.Scanner;

public class Zadanie3
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 10;
        int j = 0;
        int cons = 5;

        int[] arr = new int[n];
        int[] arr1 = new int[n];

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            if(arr[i]==cons){
                arr1[j] = ++i;
                System.out.print(" " + arr1[j]);
                j++;
            }
        }

        in.close();
    }
}

