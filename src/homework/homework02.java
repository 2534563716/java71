package homework;

public class homework02 {
    public static void main(String[] args) {
        int[] nums={8,7,3,9,5,4,1};
        int max=0;
        int index=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]>max){
                index=i;
                max=nums[i];
            }
        }
        System.out.println("最大值为："+max+",索引："+index);
    }
}
