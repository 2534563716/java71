package note;

import java.util.Scanner;
public class note01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] scrose =new int[]{99,82,85,63,60,0};
        System.out.println("请输入新增成绩");
        int result =input.nextInt();
        int index =scrose.length-1;
        for (int i=0;i<scrose.length-1;i++){
            if (result>scrose[i]){
                index=i;
                break;
            }
        }
        for (int i=scrose.length-1;i>index;i--){
            scrose[i]=scrose[i-1];
        }
        scrose[index]=result;
        System.out.println("插入成绩下标"+index);
        System.out.println("插入后成绩的信息是");
        for (int scroe:scrose){
            System.out.print(scroe+"\t");
        }
    }

}
