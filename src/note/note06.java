package note;

import java.util.Arrays;

public class note06 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6};
        int[] c=new int[a.length+b.length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        System.out.println(Arrays.toString(c));

        String[] fruit={"apple","banana","pear","grape"};
        String[] newfruit=new String[fruit.length+1];
        System.arraycopy(fruit,0,newfruit,0,fruit.length);
        for (int i = 0; i < newfruit.length; i++) {
            if (newfruit[i]==null){
                newfruit[i]="orange";
                break;
            }
        }
        System.out.println(Arrays.toString(newfruit));
    }
}
