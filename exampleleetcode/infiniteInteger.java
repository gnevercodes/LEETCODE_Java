
public class infiniteInteger {

    // this is sorted array , so we will be using binary search . ..... 
    public static void main(String[] args) {

    }

    // we cannot use arr.length , 
    // we find start and end index where our target is 
    /* 
     * we move in chunk , a bigger chunk of length [somethig]
     *  increase the size of the window exponentially . 
     *   
     */
    public static int findingWindowSize(int[] nums, int target) {
        int start = 0;
        int end = 1;
        while (target > nums[end]) {
            int temp = start + 1; // this is new start 
            // we need to find box size  ; 
            // then we need to double it . 
            // end = previous end + sizeofBox(old) *2 ; 

            end = end + (end - start + 1) * 2;
            start = temp;

        }
        return infiniteIntegerArray(nums, target, start, end);

    }

    public static int infiniteIntegerArray(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int midpoint = start + (end - start) / 2;
            if (target < nums[midpoint]) {
                end = midpoint - 1;
            } else if (target > nums[midpoint]) {
                start = midpoint + 1;
            } else {
                return midpoint;
            }
        }
        return -1; // target not found
    }

}
