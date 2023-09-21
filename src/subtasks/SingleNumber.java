package subtasks;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    // solution 1 :
    // time complexity: O(n)
    // note : this solution only works if the numbers repeated numbers are in pairs

    public int singleNumberFromPairs(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    // solution 2:
    // time complexity: O(n)
    // note : this solution works for any number of repeated numbers
    public int singleNumber(int[] nums) {
        int result = 0;
        Set<Integer> seenRepeated = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if(seenRepeated.contains(num)){
                continue;
            }else if(seen.contains(num)) {
                seenRepeated.add(num);
                seen.remove(num);
            }else{
                seen.add(num);
            }
        }
        return seen.iterator().next();
    }

}
