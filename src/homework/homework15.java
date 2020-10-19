package homework;

import java.util.Scanner;

public class homework15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入数组行和列：");
        int x=input.nextInt();
        int y=input.nextInt();
        int[][] nums=new int[x][y];
        System.out.println("请输入数组元素");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i <nums.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]+" ");
            }
        }
        System.out.println();
        System.out.println("********************************");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[j][i]+" ");
            }
        }
    }
}
