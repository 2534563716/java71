package homework;

import java.util.Scanner;

public class homework08 {
    public static void main(String[] args) {
        String[] names={"Angelia","Alice","tome","sam","Jack","Ruby","Robin","Anne"};
        int index=-1;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入要删除的人名：");
        String name=input.next();
            for (int i = 0; i < names.length; i++) {
                if (name.equalsIgnoreCase(names[i])) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("没有找到所删除人名"+name+"，无法删除！");
            } else {
                for (int i = index; i < names.length - 1; i++) {
                    names[i] = names[i + 1];
                }
                names[names.length - 1] = null;
                for (int i = 0; i < names.length-1; i++) {
                    System.out.print(names[i]+"\t");

            }
        }
    }
}
