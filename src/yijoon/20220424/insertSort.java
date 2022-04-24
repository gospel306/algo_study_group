public class InsertSort {
    public static void main(String[] args) {
        int[] numbers = {7,3,2,8,9,4,6,1,5};

        for(int i=1; i<numbers.length; i++){
            // 타겟 넘버
            int target = numbers[i];
            // 타겟 왼쪽 인덱스
            int j =  i-1;

            // 타겟이 왼쪽보다 작을때 실행
            while(j >= 0 && target < numbers[j]){
                numbers[j+1] = numbers[j];
                // 계속 왼쪽과 비교
                j--;
            }
            // 타겟 저장
            numbers[j + 1] = target;

            for(int num : numbers){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}