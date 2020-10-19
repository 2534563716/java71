package note;

import java.util.Arrays;

public class note04 {
    public static void main(String[] args) {
        int[] arr1={2,5,6,3,5};
        int[] arr2={2,5,6,3,5};
        System.out.println("判断arr1数组与arr2数组中的袁殊是否相等"+ Arrays.equals(arr1,arr2));
        int[] arr3={2,6,6,4,5};
        Arrays.fill(arr3,1,2,9);
        System.out.println("将数组中arr3中的元素替换"+Arrays.toString(arr3));
        int[] arr4={1,6,5,5,22,2};
        int[] arr5=Arrays.copyOf(arr4,arr4.length);
        System.out.println("将数组中的arr4中的元素复制到arr5中"+Arrays.toString(arr5));
        int[] arr6={52,64,32,55,54};
        Arrays.sort(arr6);
        int index=Arrays.binarySearch(arr6,55);
        System.out.println("查询数组元素对应的下标"+index);
    }
}
