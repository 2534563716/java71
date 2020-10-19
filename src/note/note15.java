package note;
import java.util.Scanner;
public class note15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] num3 = new int[2][3];
        for (int i=0;i<num3.length;i++){
            int sum=0;
            for (int j=0;j<num3[i].length;j++){
                System.out.println("请输入"+(i+1)+"班，第"+(j+1)+"个学生成绩");
                num3[i][j] = input.nextInt();
                sum=num3[i][j];
            }
            System.out.println("第"+i+1+"班总成绩"+sum);
        }
    }
}
