public class SelectSort {
    public static void main(String[] args) {
        int[] numbers = {7,3,2,8,9,4,6,1,5};

        for(int i=0; i<numbers.length - 1; i++){            // 총 arr-1 만큼 반복
            int minIdx = i;

            for(int j=i+1; j<numbers.length; j++){          // i 보다 1 큰것부터 비교
                if(numbers[minIdx] > numbers[j]){
                    minIdx = j;
                }
            }
            swap(numbers, minIdx, i);
            for(int num : numbers){
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }

    private static void swap(int[] numArr, int minIdx, int i){
        int tmp = numArr[i];
        numArr[i] = numArr[minIdx];
        numArr[minIdx] = tmp;
    }
}