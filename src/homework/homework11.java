package homework;


public class homework11 {
    public static void main(String[] args) {
        int[][] scroe = new int[3][5];
        String[] names = {"张三", "李四", "王五"};
        String[] courses = {"CoreJava", "Java", "MySQL", "JSP", "HTML"};
        for (int i = 0; i < scroe.length; i++) {
            for (int j = 0; j < scroe[i].length; j++) {
                scroe[i][j] = (int) (Math.random() * 100);

            }
        }
        for (int k = 0; k < courses.length; k++) {
            System.out.print("\t" + courses[k] + "\t");
        }
        System.out.println();
        for (int i = 0; i < scroe.length; i++) {

            System.out.print(names[i] + "\t");
            for (int j = 0; j < scroe[i].length; j++) {
                System.out.print("\t" + scroe[i][j] + "\t\t");
            }
            System.out.println("\n---------------------------------------------------------------");
        }
        int[] totals = new int[scroe.length];
        double[] avg=new double[scroe.length];
        for (int i = 0; i < scroe.length; i++) {
            totals[i] = 0;
            for (int j = 0; j < scroe[i].length; j++) {
                totals[i] += scroe[i][j];
                avg[i]=totals[i]/scroe.length;
            }
        }
        System.out.println("打印每个学员的总分：");
        System.out.println("姓名\t\t总分");
        System.out.println("------------------------------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
            System.out.println("\t\t" + totals[i]);
            System.out.println("------------------------------------------");
        }
        System.out.println("打印每个学员的平均分：");
        System.out.println("姓名\t\t平均分");
        System.out.println("------------------------------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
            System.out.println("\t\t" + avg[i]);
            System.out.println("------------------------------------------");
        }
    }
}
