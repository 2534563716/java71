package note;

import java.util.Arrays;

public class note03 {
    public static void main(String[] args) {
        int[] nums=new int[]{3,1,2,4,6};
        int[] newArr = new int[nums.length];
        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            newArr[j] = nums[i];
        }
        Arrays.sort(newArr);
        System.out.println(Arrays.toString(newArr));
    }
}
