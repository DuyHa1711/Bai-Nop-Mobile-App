import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n < 3 && n > 8){
            System.out.println("Nhap lai n: ");
            n = sc.nextInt();
        }
        int[][] arr = new int[n][n];
        int xtoa = 0;
        int ytoa = 0;
        int num = 1;
        int h = n;
        while (h > 0){
            for (int x = 0; x < h;x++){
                arr[xtoa][ytoa] = num;
                num++;
                ytoa++;
            }
            ytoa--;
            xtoa++;
            for (int x = 0; x < h-1;x++){
                arr[xtoa][ytoa] = num;
                num++;
                xtoa++;
            }
            xtoa--;
            ytoa--;
            for (int x = 0; x < h-1;x++){
                arr[xtoa][ytoa] = num;
                num++;
                ytoa--;
            }
            ytoa++;
            xtoa--;
            for (int x = 0; x < h-2;x++){
                arr[xtoa][ytoa] = num;
                num++;
                xtoa--;
            }
            h = h - 2;
            xtoa++;
            ytoa++;

        }
        for (int x=  0; x < n;x++){
            for (int y = 0; y < n;y++){
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
