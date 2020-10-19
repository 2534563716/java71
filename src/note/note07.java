package note;

import java.util.Arrays;
import java.util.Scanner;

public class note07 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Pear", "Orange", "Grape", null};
        Scanner input=new Scanner(System.in);
        System.out.println("请输入增加水果名：");
        String fruit=input.next();
        int index=-1;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i]==null){
                index=i;
                break;
            }
        }
        if (index!=-1){
            fruits[index]=fruit;
        }
        System.out.println(Arrays.toString(fruits));
    }
}
