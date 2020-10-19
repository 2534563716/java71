package homework;

import java.util.Scanner;

public class homework12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] nums = new int[5][3];
        for (int i=0;i<nums.length;i++) {
            int sum = 0;
            int avg=0;
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println("请输入" + (i + 1) + "人，第" + (j + 1) + "门成绩");
                nums[i][j] = input.nextInt();
                sum+= nums[i][j];
                avg = sum/nums[i].length;

            }
            System.out.println("第" + (i + 1) + "人总成绩" + sum);
            System.out.println("第" + (i + 1) + "人平均分" + avg);

        }
        for (int i = 0; i < nums.length; i++) {
            int max =nums[i][0];
            int min =nums[i][0];
            for (int j = 1; j < nums[i].length; j++) {
                if (max<=nums[i][j]){
                    max=nums[i][j];
                }
                if (min>=nums[i][j]){
                    min=nums[i][j];
                }
            }
            System.out.println("第" + (i + 1) + "人最高分" + max);
            System.out.println("第" + (i + 1) + "人最底分" + min);
        }
    }
}
