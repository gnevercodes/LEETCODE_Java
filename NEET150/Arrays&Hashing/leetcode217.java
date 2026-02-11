
import java.util.*;

public class leetcode217 {

    class Solution {

        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> seen = new HashSet<>(); // hashset
            for (int num : nums) {
                if (seen.contains(num)) {
                    return true;
                }
                seen.add(num);
            }
            return false;

        }
    }
}

/**
 * use hashset 
 * iterate over a for loop 
 * if the hashset contains the number we are trying to insert 
 * insert that and return true
 * or else false. 
 */
