package homework;

import java.util.Scanner;

public class homework13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] nums = new int[4][3];
        for (int i=0;i<nums.length;i++) {
            int sum = 0;
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println("请输入" + (i + 1) + "季度，第" + (j + 1) + "月销售额");
                nums[i][j] = input.nextInt();
                sum += nums[i][j];
            }
            System.out.println((i + 1) + "季度销售额"+sum);
        }
    }
}
