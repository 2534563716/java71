package homework;

import java.util.Arrays;
import java.util.Scanner;

public class homework10 {
    public static void main(String[] args) {
        String[] names={"Angelia","Alice","tome","sam","Jack","Ruby","Robin","Anne"};
        int index=0;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入要查询的人名：");
        String name=input.next();
        String[] newNmae=new String[0];
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                newNmae = Arrays.copyOf(newNmae, newNmae.length + 1);
                newNmae[index++] = names[i];
            }
        }
        System.out.println("查询人名信息是：" + Arrays.toString(newNmae));
    }
}
