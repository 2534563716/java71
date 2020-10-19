package homework;

public class homework03 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10);
        }
        System.out.println("排序前的数组");
        for (int num : nums) {
            System.out.print(num + "\t");
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("升序后的数组");
        for (int number : nums) {
            System.out.print(number + "\t");
        }


        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("降序序后的数组");
        for (int num : nums) {
            System.out.print(num + "\t");
        }

        int sum=0;
        int avg=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        avg=sum/nums.length;
        System.out.println("数组的和为："+sum+"，数组的平均值"+avg);
    }
}
