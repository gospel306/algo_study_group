import java.util.Arrays;

public class Sort_Selection {
    
    //두 배열의 위치를 바꾼다 --> 두 배열의 index교환
    public static void selectionSort(int[] intarr) {

        //최소값이 있는 배열 인덱스 구하기
        for(int i=0;i< intarr.length-1;i++){
            int minIdx = i;
            for(int j=i;j<intarr.length;j++){     //최소 배열의 인덱스 구하기 / 처음부터(갈수록-1) 끝까지 조회
                if(intarr[minIdx]>intarr[j]){
                    minIdx = j;
                }
            }
            int temp = intarr[i];
            intarr[i] = intarr[minIdx];
            intarr[minIdx] = temp;

            System.out.println(i + "turn: " + Arrays.toString(intarr));
            System.out.println("--------------------------------");
        }
    }

    public static void main(String[] args) {
        int[] intarr = {7,3,2,8,9,4,6,1,5};
        selectionSort(intarr);
    }
}
