package Arrays;

public class FindMax {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int arr[]={1,2,3,4,4,5,6};
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        System.out.println(max);
    }
}
