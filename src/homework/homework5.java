package homework;

import java.util.Arrays;

public class homework5 {
    public static void main(String[] args) {
       /* 使用Arrays工具类Arrays.sort(数组名)升序排列一组字符
       char[] chars = {'a','c','u','b','e','p','f','z'}，并查找某个特殊字符在升序后数组中的位置(下标)。*/

        char[] chars = {'a','c','u','b','e','p','f','z'};
        Arrays.sort(chars);
        System.out.println("升序后的数组："+Arrays.toString(chars));
        int index=Arrays.binarySearch(chars,'c');
        System.out.println("数组中c的位置"+index);

    }
}
