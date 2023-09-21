package subtasks;

import java.util.Arrays;

public class NotContains {

    // solution 1 :
    // time complexity: O(n*log(n)

    public int notContains(int[] nums) {
        var ref = new Object() {
            int result = 1;
        };
        Arrays.stream(nums).sorted().forEach(num -> {
            if (num == ref.result) {
                ref.result++;
            }
        });
        return ref.result;
    }
}
