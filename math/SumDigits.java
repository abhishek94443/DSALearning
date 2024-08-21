package math;

import java.util.Scanner;

public class SumDigits {
    public static int digitSum(String num){
        char []c=num.toCharArray();
        int sum=0;
        for (int i = 0; i < c.length; i++) {
            sum+= (c[i]-'0');
        }return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(digitSum(Integer.toString(n)));
        int sum=0;
        while(n!=0){
            int num=n%10;
            sum+=num;
            n=n/10;
        }
        System.out.println(sum);

    }
}
