package tests;

import org.junit.jupiter.api.Test;
import subtasks.CountVariants;

import static org.junit.jupiter.api.Assertions.*;

class CountVariantsTest {

    @Test
    void countVariants() {
        int n = 3;
        int expected = 3;
        int actual = new CountVariants().countVariants(n);
        assertEquals(expected, actual);
    }
}