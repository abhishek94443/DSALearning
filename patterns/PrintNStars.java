package patterns;

import java.util.Scanner;

public class PrintNStars {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("*");

        }
    }
}
