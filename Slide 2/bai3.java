import java.util.Scanner;


public class bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n < 2 || n > 10){
            System.out.println("Nhap lai n: ");
            n = sc.nextInt();
        }
        sc.close();
        for (int x = 1; x <= n;x++){
            for (int y = 1; y <= x;y++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
