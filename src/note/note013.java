package note;

public class note013 {
    /**选择排序
     * 定义数组
     * 循环比较
     * 交换元素
     */
    public static void main(String[] args) {
        int[] arrs={4,7,3,9,1};
        int min=-1;
        for (int i = 0; i < arrs.length; i++) {
            min=i;//每轮min初始值
            for (int j = i+1; j < arrs.length; j++) {//内层，当前元素和后面元素比较，记录最新的最小元素下标
                if (arrs[min]>arrs[j]){
                    min=j;
                }
            }
            if (min!=i){//如果min发生变化，说明发现了更小的值，将当前值和最小值交换，保证小值在数组前面
                int temp=arrs[min];
                arrs[min]=arrs[i];
                arrs[i]=temp;
            }
        }
        for (int arr:arrs) {
            System.out.println(arr);
        }
    }
}
