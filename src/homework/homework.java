package homework;

import java.util.Arrays;

public class homework {
    public static void main(String[] args) {
        /*int[] arr11 = {1, 2, 3, 4,5,6,7,8,9,0,3,2,4,5,6,7,4,32,2,1,1,4,6,3}; 数组去重*/
        int[] arr11 = {1,2,3,4,5,6,7,8,9,0,3,2,4,5,6,7,4,32,2,1,1,4,6,3};
        int[] num=new int[0];
        int k=0;
        for (int i=0;i<arr11.length;i++) {
            boolean flag=false;
            for (int j=i+1;j<arr11.length;j++){
                if (arr11[i]==arr11[j]){
                    flag=true;
                    break;
                }
            }
            if (!flag){
                num=Arrays.copyOf(num,num.length+1);
                num[k++]=arr11[i];

            }
        }
        System.out.println(Arrays.toString(num));

    }
}
