package tests;

import org.junit.jupiter.api.Test;
import subtasks.MyHashSet;

import static org.junit.jupiter.api.Assertions.*;

class MyHashSetTest {

    @Test
    void add() {
        var set = new MyHashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        assertTrue(set.contains(1));
        assertTrue(set.contains(2));
        assertTrue(set.contains(3));
        assertTrue(set.contains(4));
        assertTrue(set.contains(5));
    }

    @Test
    void remove() {
        var set = new MyHashSet();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.remove(1);
        set.contains(2);
        set.remove(2);
        assertTrue(set.contains(4));
        assertTrue(set.contains(5));
        assertFalse(set.contains(1));
        assertFalse(set.contains(2));
    }

    @Test
    void contains() {
        var set = new MyHashSet();
        assertFalse(set.contains(1));
        set.add(1);
        assertTrue(set.contains(1));
        set.add(2);
        assertTrue(set.contains(2));
        set.add(3);
        assertTrue(set.contains(3));
        set.add(4);
        assertTrue(set.contains(4));
        set.add(5);
        assertTrue(set.contains(5));
    }
    //["MyHashSet","add","add","contains","contains","add","contains","remove","contains"]
    //[[],[1],[2],[1],[3],[2],[2],[2],[2]]
    @Test
    void test() {
        var set = new MyHashSet();
        set.add(1);
        set.add(2);
        assertTrue(set.contains(1));
        assertFalse(set.contains(3));
        set.add(2);
        assertTrue(set.contains(2));
        set.remove(2);
        assertFalse(set.contains(2));
    }

}