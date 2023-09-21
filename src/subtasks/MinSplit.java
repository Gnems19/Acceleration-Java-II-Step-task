package subtasks;

public class MinSplit {

    // solution 1 :
    // time complexity: O(number of coin types) -> O(1)

    public int minSplit(int amount) {
        int result = 0;
        int[] coins = {1, 5, 10, 20, 50};
        for (int i = coins.length - 1; i >= 0; i--) {
            result += amount / coins[i];
            amount %= coins[i];
        }
        return result;
    }
}
