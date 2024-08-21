package math;

import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.stream.Stream;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int num=n%10;
            sum+=num;
            n=n/10;
        }
        System.out.println(sum);
    }
}
