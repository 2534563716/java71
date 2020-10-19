package note;

import java.util.Arrays;

public class note02 {
    public static void main(String[] args) {
        int[] numbers = new int[]{16, 25, 9, 90, 23};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }
        System.out.println();
        /*
        冒泡排序原理
        *1.比较相邻两个元素，如果第一个元素大于第二个元素，就互换
        *2.对相邻的每个元素做相同的工作。从开始第一队到结尾的最后一位元素，最后的元素应该是最大的
        *3.针对所有元素重复以上步骤，除了最后一个元素
        *4.持续对每次越来越少的元素重复上面的步骤，知道没有任何一个元素比较为止
         */
        /*
        冒泡排序口诀
        N个数来排对，两两比较小靠前
        外层循环N-1，内层循环N-i-1
        如果需要降序，请将大于号换成小于号
        冒泡排序最坏的比较次数公式：（N-1）*N/2=(5-1)*5/2=10
         */
        //冒泡排序
        //外层循环控制轮次
        for (int i = 0; i < numbers.length - 1; i++) {
            //内层循环控制比较次数
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
            System.out.println("第" + (i + 1) + "轮" + Arrays.toString(numbers));
        }
        System.out.println("排序后，打印数组各个元素");
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }
}
