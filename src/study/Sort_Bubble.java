import java.util.Arrays;
import java.util.Scanner;

public class Sort_Bubble {

    public static void bubbleSort(int[] arr){
        for(int i=1;i<arr.length;i++){        //0자리~ 끝까지 비교(가장 큰 수가 끝으로 가는 것)
            for(int j=0;j<arr.length-i;j++){    //1turn
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
            System.out.println(i + "turn: " + Arrays.toString(arr));
            System.out.println("--------------------------------");
        }
    }

    public static void main(String[] args) {
//        int[] intarr = {8, 3, 7, 5, 4, 2};
        int[] intarr = {1, 2, 3, 4, 5, 6};

        bubbleSort(intarr);
    }

}
