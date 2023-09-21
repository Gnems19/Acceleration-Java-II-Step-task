package tests;

import org.junit.jupiter.api.Test;
import subtasks.NotContains;

import static org.junit.jupiter.api.Assertions.*;

class NotContainsTest {

    @Test
    void notContainsWithEmpty() {
        int[] nums = {};
        int expected = 1;
        int actual = new NotContains().notContains(nums);
        assertEquals(expected, actual);
    }
    @Test
    void notContainsWithOne() {
        int[] nums = {1};
        int expected = 2;
        int actual = new NotContains().notContains(nums);
        assertEquals(expected, actual);
    }
    @Test
    void notContainsByHand() {
        int[] nums = {1, 2, 4};
        int expected = 3;
        var solver = new NotContains();
        assertEquals(expected, solver.notContains(nums));
        int[] nums2 = {1, 2, 12412, 1241, 21412, 24, 241, 412, 4124, 124, 242, 424, 24, 423, 23, 13, 241, 11, 2, 4, 56, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        expected = 3;
        assertEquals(expected, solver.notContains(nums2));
        int[] nums3 = {-11, -2, -1};
        expected = 1;
        assertEquals(expected, solver.notContains(nums3));
    }
    @Test
    void notContainsWithRandom() {
        // generate random integer for the answer
        int answer;
        int tests = 100;
        var solver = new NotContains();
        for(int t = 0; t<tests; t++) {
            answer = (int) (Math.random() * 1000) + 1;
            // generate an array with numbers from 1 to 1000 except the answer
            int[] nums = new int[1000];
            int index = 0;
            for (int i = 1; i <= 1000; i++) {
                if (i != answer) {
                    nums[index] = i;
                    index++;
                } else {
                    nums[index] = 1001;
                }
            }
            int expected = answer;
            assertEquals(expected, solver.notContains(nums));
            System.out.println("Test " + t + " passed" + " with answer " + answer);
        }

    }
}