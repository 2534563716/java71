package note;

import java.util.Arrays;
import java.util.Scanner;

public class note10 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Pear", "Orange", "Grape"};
        Scanner input=new Scanner(System.in);
        System.out.println("请输入要查询的水果名关键字：");
        String fruit=input.next();
        String[] strFruits = new String[0];
        int m = 0;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].contains(fruit)) {
                strFruits = Arrays.copyOf(strFruits, strFruits.length + 1);
                strFruits[m++] = fruits[i];
            }
        }
        System.out.println("查询水果信息是：" + Arrays.toString(strFruits));
    }
}
