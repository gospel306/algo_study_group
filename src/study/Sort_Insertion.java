import java.util.Arrays;

public class Sort_Insertion {
    //삽입 정렬
    //1. target은 배열의 두번째부터 끝까지
    //2. 그 이전의 배열에서 비교하여 넣는다


    public static void insertionSort(int[] intarr) {

        //1. wrong
        // 7,3,2,8,9,4,6,1,5
        for(int i=1;i<intarr.length;i++){
            int targetIdx = i;      //taget은 두번째 배열부터 끝까지 감 //i = targetIdx
//
//            for(int j=targetIdx-1;j>=0;j--){
//                System.out.println("target:: " + targetIdx);
//
//                System.out.println("j::" + j);
//                if(intarr[targetIdx]<intarr[j]){
//                    int temp = intarr[j];
//                    intarr[j] = intarr[targetIdx];
//                    intarr[targetIdx] = temp;
//                    System.out.println(Arrays.toString(intarr));
//                    targetIdx--;
//                }
//            }




            //2. 아리까리    
            //targetIndex와 그 이하의 배열 비교
//            for(int j=0;j<i;j++){
//
//                if(intarr[j]>intarr[targetIdx]){
//                    System.out.println("j::" + j);
//                    int temp = intarr[j];
//                    intarr[j] = intarr[targetIdx];
//                    intarr[targetIdx] = temp;
//                    System.out.println(Arrays.toString(intarr));
//
//                }
//            }

            //3. for문
//            for(int j=targetIdx-1;j>=0;j--){
//                if(intarr[j]>intarr[targetIdx]){
//                    int temp = intarr[j];
//                    intarr[j] = intarr[targetIdx];
//                    intarr[targetIdx] = temp;
//                    targetIdx--;
//                }
//            }


            //4. 다른 방법  --> for to while
            while(targetIdx-1>=0 && intarr[targetIdx-1]>intarr[targetIdx]){
                int temp = intarr[targetIdx-1];
                intarr[targetIdx-1] = intarr[targetIdx];
                intarr[targetIdx] = temp;
                targetIdx--;
                System.out.println(Arrays.toString(intarr));

            }
            System.out.println(i + "turn: " + Arrays.toString(intarr));
            System.out.println("--------------------------------");


            
        }
    }

    public static void main(String[] args) {
        int[] intarr = {7,3,2,8,9,4,6,1,5};
        insertionSort(intarr);
    }
}
