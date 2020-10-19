package note;

public class note20 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int k = 1; k <= 5 - i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i) - 1 ; j++) {
                if(j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        for (int i = 4; i > 0 ; i--) {
            for (int k = 1; k <= 5 - i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i) - 1 ; j++) {
                if(j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
