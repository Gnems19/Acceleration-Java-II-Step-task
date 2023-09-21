package tests;

import org.junit.jupiter.api.Test;
import subtasks.SingleNumber;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    @Test
    void singleNumberFromPairs() {
        int[] nums = {4, 1, 2, 1, 2};
        int[] nums2 = {4, 1, 2, 1, 2, 4, 5, 5, 6, 6, 7, 7, 8};
        int[] nums3 = {1};
        var singleNumber = new SingleNumber();
        // check with assert equals
        assertEquals(4, singleNumber.singleNumberFromPairs(nums));
        assertEquals(8, singleNumber.singleNumberFromPairs(nums2));
        assertEquals(1, singleNumber.singleNumberFromPairs(nums3));
    }
    @Test
    void singleNumber() {
        int[] nums = {4, 1, 2, 1, 2};
        int[] nums2 = {4, 1, 2, 1, 2, 4, 5, 5, 6, 6, 7, 7, 8};
        int[] nums3 = {1};
        int[] nums4 = {4, 1, 2, 1, 2, 4, 5, 5, 5, 6, 6, 6, 7, 7, 8};

        var singleNumber = new SingleNumber();
        // check with assert equals
        assertEquals(4, singleNumber.singleNumber(nums));
        assertEquals(8, singleNumber.singleNumber(nums2));
        assertEquals(1, singleNumber.singleNumber(nums3));
        assertEquals(8, singleNumber.singleNumber(nums4));
    }

}