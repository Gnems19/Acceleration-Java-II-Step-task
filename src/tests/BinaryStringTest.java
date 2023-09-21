package tests;

import org.junit.jupiter.api.Test;
import subtasks.BinaryString;

import static org.junit.jupiter.api.Assertions.*;

class BinaryStringTest {
    @Test
    void binaryAddWithZeros() {
        String s1 = "0";
        String s2 = "0";
        String expected = "0";
        String actual = new BinaryString().binaryAdd(s1, s2);
        assertEquals(expected, actual);
    }
    @Test
    void binaryAddNoCarry() {
        String s1 = "10";
        String s2 = "1";
        String expected = "11";
        String actual = new BinaryString().binaryAdd(s1, s2);
        assertEquals(expected, actual);
    }
    @Test
    void binaryAddWithCarry() {
        String s1 = "11";
        String s2 = "1";
        String expected = "100";
        String actual = new BinaryString().binaryAdd(s1, s2);
        assertEquals(expected, actual);
    }
    @Test
    void binaryAddRandomTest(){
        int tests = 100;
        for(int t = 0; t<tests; t++) {
            int num1 = (int) (Math.random() * 1000);
            int num2 = (int) (Math.random() * 1000);
            String s1 = Integer.toBinaryString(num1);
            String s2 = Integer.toBinaryString(num2);
            String expected = Integer.toBinaryString(num1 + num2);

            String actual = new BinaryString().binaryAdd(s1, s2);
            assertEquals(expected, actual);
            System.out.println("Test " + t + " passed" + " with numbers " + num1 + " and " + num2);
            System.out.println(s1 + " + " + s2 + " = " + actual);
        }
    }
}