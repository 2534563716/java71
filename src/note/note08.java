package note;


import java.util.Scanner;

public class note08 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Pear", "Orange", "Grape"};
        Scanner input=new Scanner(System.in);
        System.out.println("请输入要删除的水果名：");
        String fruit=input.next();
        int y = -1;
        for (int i = 0; i < fruits.length; i++) {
            if (fruit.equalsIgnoreCase(fruits[i])) {
                y = i;
                break;
            }
        }
        if (y == -1) {
            System.out.println("没有找到所删除水果名"+fruit+"，无法删除！");
        } else {
            for (int i = y; i < fruits.length - 1; i++) {
                fruits[i] = fruits[i + 1];
            }
            fruits[fruits.length - 1] = null;
            for (int i = 0; i < fruits.length-1; i++) {
                System.out.print(fruits[i]+"\t");
            }
        }

    }
}
