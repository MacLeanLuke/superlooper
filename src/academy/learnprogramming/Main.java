package academy.learnprogramming;

import java.io.InputStream;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            in.nextLine();

            int total = a;
            for (int j = 0; j < n; j++){
                total += ((Math.pow(2,j))*b);
                System.out.print(total + " ");
            }
            System.out.println();
        }
        in.close();
    }
}