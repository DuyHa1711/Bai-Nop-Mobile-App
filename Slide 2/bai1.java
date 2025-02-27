import java.util.Scanner;
import java.util.Random;

public class bai1{
    public static void main(String[] args){
        System.out.print("Nhap do dai day so: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int x = 0; x < n;x++){
            arr[x] = sc.nextInt();
        }
        Random rd = new Random();
        for (int i = 0; i < n; i++){
            int j = rd.nextInt(n);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int x = 0; x < n;x++){
            System.out.print(arr[x] + " ");
        }
        sc.close();
    }
}
