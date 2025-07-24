/*You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.

Example 1:

Input: arr = [0,1,0]

Output: 1

Example 2:

Input: arr = [0,2,1,0]

Output: 1

Example 3:

Input: arr = [0,10,5,2]

Output: 1 */
 /*
 * Linear not possible because of TC
 * Binary , first part is in ascending , second part is in Descending.
 * it is sorted but it is split into two types [ ASC : DESC ]
 */
public class leet852 {

    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int middlepoint = start + (end - start) / 2;

            if (arr[middlepoint] > arr[middlepoint + 1]) {
                // in decresasing part 
                end = middlepoint;
            } else {
                start = middlepoint + 1; // in ascending part of the array . 
            }
        }
        // in the end both start and end points to one value only. 
        return start;
    }
}
