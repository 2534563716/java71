package homework;

import java.util.Arrays;
import java.util.Scanner;

public class homework06 {
    public static void main(String[] args) {
        /*输入五种水果的英文名称(如葡萄grape，橘子orange，香蕉banana，苹果apple，桃peach)，
        编写一个程序，输出这些水果的名称(按照在字典里出现的先后顺序输出)*/
        Scanner input=new Scanner(System.in);
        String[] fruit =new String[5];
        for (int i=0;i<fruit.length;i++){
            System.out.println("请输入"+(i+1)+"水果名字：");
            fruit[i]=input.next();
        }
        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));
    }
}
