import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] nums = {5,3,8,9,2,4,7};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums){
        l_pivot_sort(nums, 0, nums.length-1);
    }
    /**
     * 왼쪽 피벗 선택 방식
     * @param nums  정렬할 배열
     * @param lo    현재 부분배열의 왼쪽
     * @param hi    현재 부분배열의 오른쪽
     */
    private static void l_pivot_sort(int[] nums, int lo, int hi) {
        /*
         * lo가 hi보다 크거나 같다면 정렬 할 원소가
         * 1개 이하이므로 정렬하지 않고 return 한다
         */
        if(lo>=hi){
            return;
        }

        int pivot = partition(nums, lo, hi);

        l_pivot_sort(nums, lo, pivot-1);
        l_pivot_sort(nums, pivot, hi);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (arr[low] < pivot) low++;
            while (arr[high] > pivot) high--;
            if (low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }
        return low;
    }

    private static void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
