package math;

import java.util.Scanner;

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
