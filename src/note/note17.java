package note;

public class note17 {
    public static void main(String[] args) {
        int[][] scores = new int[6][5];
        int[] sum = new int[6];
        int[] average = new int[5];
        int total = 0;
        System.out.println("学号"+"\t"+"C++"+"\t"+"Java"
                +"\t"+"C#"+"\t\t"+"JSP"+"\t\t"+"HTML"+"\t\t"+"总成绩");//打印课程信息
        for (int i = 0; i < scores.length; i++) {
            System.out.print(i+1+"\t");//输出序号
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j]=(int)(Math.random()*101);//产生0~100（包含0和100）之间的随机整数，给二维数组赋值
                System.out.print(scores[i][j]+"\t\t");
                sum[i]+=scores[i][j];//求每一个学员的总成绩
                average[j]+=scores[i][j];//求单科成绩的所有学生的总分
            }
            total+=sum[i]; //总分
            System.out.print(" ");
            System.out.println(sum[i]);

        }
        //System.out.print("平均分"+"\t");
        System.out.println("----------------------------------------------------------");
        System.out.print("\t");
        for (int i = 0; i < average.length; i++) {
            System.out.print(average[i]/scores.length+"\t\t");
        }
        System.out.print(total/scores.length);
    }
}
