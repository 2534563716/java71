package homework;


public class homework14 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int x = 2;
        int y = 1;
        for (int i = 1; i < 10; i++) {
            arr[x++][y++] = i;
            if ((i%3) == 0) {
                x = x - 2;
                y = y - 1;
            }else {
                x = x % 3;
                y = y % 3;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i+1)+"|");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
