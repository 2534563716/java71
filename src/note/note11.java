package note;

public class note11 {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9};
        int searchNum=6;
        int startIndex=0;
        int endIndex=arr.length-1;
        boolean flag=false;
        int midIndex=-1;
        do {
            midIndex=(startIndex+endIndex)/2;
            if (arr[midIndex]==searchNum){
                System.out.println("找到这个数达下标"+midIndex);
                flag=true;
                break;
            }else if (arr[midIndex]>searchNum){
                endIndex=midIndex-1;
            }else {
                startIndex=midIndex+1;
            }
        }while (startIndex<=endIndex);
        if (!flag){
            System.out.println("没找到数字");
        }
    }
}
