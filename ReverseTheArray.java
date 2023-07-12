import java.util.Scanner;
public class ReverseTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr, n);
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    static int[] reverseArray(int[] arr,int n) {
        int i = 0,j = n-1;
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
        return arr;
    }
}