package tests;

import org.junit.jupiter.api.Test;
import subtasks.MinSplit;

import static org.junit.jupiter.api.Assertions.*;

class MinSplitTest {

    @Test
    void minSplitForZero(){
        int amount = 0;
        var minSplit = new MinSplit();
        assertEquals(0, minSplit.minSplit(amount));
    }
    @Test
    void minSplitForCoinTypes(){
        int[] coins = {1, 5, 10, 20, 50};
        for(int coin : coins){
            int amount = coin;
            var minSplit = new MinSplit();
            assertEquals(1, minSplit.minSplit(amount));
        }
    }
    @Test
    void minSplitForBigNumbers(){
        int amount = 1000000000;
        var minSplit = new MinSplit();
        assertEquals(20000000, minSplit.minSplit(amount));
    }
    @Test
    void minSplitByHand(){
        var minSplit = new MinSplit();
        assertEquals(3, minSplit.minSplit(52));
        assertEquals(2, minSplit.minSplit(100));
        assertEquals(3, minSplit.minSplit(101));
        assertEquals(5, minSplit.minSplit(103));
        assertEquals(5, minSplit.minSplit(50+20+10+5+1));
        assertEquals(4, minSplit.minSplit(50+50+5+1));
    }


}