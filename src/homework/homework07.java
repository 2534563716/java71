package homework;

import java.util.Arrays;
import java.util.Scanner;

public class homework07 {
    public static void main(String[] args) {
        String[] names={"Angelia","Alice","tome","sam","Jack","Ruby",null,"Robin","Anne"};
        int index=-1;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入要增加的人名：");
        String name=input.next();
        for (int i = 0; i < names.length; i++) {
            if (names[i]==null){
                index=i;
                break;
            }
        }
        if (index!=-1){
            names[index]=name;
        }else {
            System.out.println("数组已满无法加入");
        }
        System.out.println(Arrays.toString(names));
    }
}
