package homework;

import java.util.Arrays;
import java.util.Scanner;

public class homework09 {
    public static void main(String[] args) {
        String[] names={"Angelia","Alice","tome","sam","Jack","Ruby","Robin","Anne"};
        int index=-1;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入要修改的人名：");
        String name=input.next();
        System.out.println("修改成的人名：");
        String name01=input.next();
        for (int i = 0; i < names.length; i++) {
            if (name.equalsIgnoreCase(names[i])){
                index=i;
                break;
            }
        }
        if (index!=-1){
            names[index]=name01;
        }
        System.out.println(Arrays.toString(names));
    }
}
