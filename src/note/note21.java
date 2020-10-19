package note;

import java.util.Scanner;

public class note21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入行数");
        int n = input.nextInt();
        int[][] arrs = new int[n][n];
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    arrs[i][j] = 1;
                } else {
                    arrs[i][j] = arrs[i - 1][j - 1] + arrs[i - 1][j];
                }
            }
        }
        for (int i = 0; i < arrs.length; i++) {
            for (int k = arrs.length - i; k > 0; k--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(arrs[i][j] + "   ");
            }
            System.out.println(" ");
        }
    }
}
