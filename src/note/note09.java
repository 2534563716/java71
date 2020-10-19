package note;

import java.util.Arrays;
import java.util.Scanner;

public class note09 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Pear", "Orange", "Grape"};
        Scanner input=new Scanner(System.in);
        System.out.println("请输入要修改的水果名：");
        String fruit=input.next();
        System.out.println("修改成的水果名：");
        String fruit01=input.next();
        int index=-1;
        for (int i = 0; i < fruits.length; i++) {
            if (fruit.equalsIgnoreCase(fruits[i])){
                index=i;
            }
        }
        if (index!=-1){
            fruits[index]=fruit01;
        }
        System.out.println(Arrays.toString(fruits));
    }
}
