package Zadanie2;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        double d = (Math.pow(Math.max(a, b),5) - 3.2 * Math.min(a,b))/1+Math.min(a,b);
        System.out.println(d);
        in.close();

    }

}