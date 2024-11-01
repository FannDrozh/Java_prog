package  Zadanie1;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        if(x>y){
            System.out.println(x*2);
        }
        else{
            System.out.println(y*2);
        }
        in.close();

    }

}
