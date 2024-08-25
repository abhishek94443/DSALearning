package math;

public class Power {


    public static void main(String[] args) {
        int n=2;
        int pow=5;
        int res=1;
        for (int i = 0; i < pow; i++) {
            res*=n;
        }
        System.out.println(res);
    }
}
