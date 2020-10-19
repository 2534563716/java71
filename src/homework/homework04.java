package homework;

import java.util.HashMap;
import java.util.Map;

public class homework04 {
    public static void main(String[] args) {
       /* 向一个长度为10的整型数组中随机生成10个0~9的随机整数，完成下列任务
        1)统计每个数字出现了多少次
        2)输出出现次数最多的数字
        3)输出只出现一次的数字中最小的数字*/

        int[] nums = new int[10];
        int[] number=new int[]{0,1,2,3,4,5,6,7,8,9};
        int[] count=new int[number.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10) ;
        }
        for (int num: nums) {
            System.out.print(num+"\t");
        }
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j]==number[i]){
                    count[i]++;
                }
            }
        }
       /* Map<Object,Integer> map = new HashMap();
        for(int num :nums){
            map.merge(num, 1, Integer::sum);
        }
        System.out.println(map);*/


        int max=count[0];
        int index1=0;
        int min=count[0];
        int index2=0;

       for (int i = 0; i < count.length; i++) {
            if (count[i]>0){
                System.out.println(i+"出现的次数为："+count[i]);
            }
            if (max<count[i]){
                number[i]=index1;
                max=count[i];
            }
            if (min>count[i]&&count[i]==1){
                number[i]=index2;
            }
        }
        System.out.println("只出现一次的数字中最小的数字："+index2);

    }
}
