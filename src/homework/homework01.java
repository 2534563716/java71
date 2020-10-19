package homework;

public class homework01 {
    public static void main(String[] args) {
        int[] scores = new int[]{84,100,34,86,87};
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - 1 - i; j++) {
                if (scores[j] < scores[j + 1]) {
                    int temp = scores[j + 1];
                    scores[j + 1] = scores[j];
                    scores[j] = temp;
                }
            }
        }
        System.out.println("排序后，打印数组各个元素");
        for (int number : scores) {
            System.out.print(number + "\t");
        }
    }
}
