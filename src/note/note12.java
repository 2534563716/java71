package note;

public class note12 {
    public static int binarySearch(int[] arr,int num){
        int low=0;
        int high=arr.length-1;
        while (low<high){
            int min=(high+low)/2;
            if (arr[min]<num){
                low=min+1;
            }else if (arr[min]>num){
                high=min-1;
            }else {
                return min;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={5,13,19,21,37,56,64,75,80,92,88};
        int index=binarySearch(arr,21);
        System.out.println("21的下标"+index);
    }
}
