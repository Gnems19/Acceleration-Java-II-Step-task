package subtasks;

public class CountVariants {

    // dp solution:
    // time complexity: O(n)

    public int countVariants(int n) {
        if (n <= 1) {
            return 1;
        }
        int[] variants = new int[n + 1];
        variants[0] = 1;
        variants[1] = 1;
        for (int i = 2; i <= n; i++) {
            variants[i] = variants[i - 1] + variants[i - 2];
        }
        return variants[n];
    }
}
