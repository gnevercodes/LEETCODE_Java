//. <https://leetcode.com/problems/find-numbers-with-even-number-of-digits/?envType=problem-list-v2&envId=array>

//  Given an array nums of integers, return how many of them contain an even number of digits.
// Example 1:
// Input: nums = [12,345,2,6,7896]
// Output: 2
// Explanation: 
// 12 contains 2 digits (even number of digits). 
// 345 contains 3 digits (odd number of digits). 
// 2 contains 1 digit (odd number of digits). 
// 6 contains 1 digit (odd number of digits). 
// 7896 contains 4 digits (even number of digits). 
// Therefore only 12 and 7896 contain an even number of digits.
// Example 2:
// Input: nums = [555,901,482,1771]
// Output: 1 
// Explanation: 
// Only 1771 contains an even number of digits.
// // 
public class Solution {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int totalOutput = findNumbers(nums);
        System.out.println(totalOutput);

    }

    public static int findNumbers(int[] arr) {
        int count = 0; // for all the numbers whose digits are even . 

        for (int i = 0; i < arr.length; i++) {
            if (even(arr[i])) { // checks if even or not returns a boolean ; 
                count += 1;
            }

        }
        return count;
    }

    static boolean even(int num) {
        int numberofTotalDigits = digits(num);
        // if (numberofTotalDigits % 2 == 0) {
        //     return true;

        // } else {
        //     return false;
        // }
        return numberofTotalDigits % 2 == 0;
    }

    // function to check if a num contains even digits or not . 
    // HERE : TODO: we do it by dividing by 10 ; 
    public static int digits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;

        }
        return count;

    }

}
