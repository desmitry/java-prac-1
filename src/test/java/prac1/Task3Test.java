package prac1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Task3Test {

    @Test
    void unequalValuesBecomeTheirSum() {
        assertArrayEquals(new int[] { 8, 8 }, Task3.transform(3, 5));
    }

    @Test
    void equalValuesBecomeZero() {
        assertArrayEquals(new int[] { 0, 0 }, Task3.transform(4, 4));
    }

    @Test
    void oppositeValuesBecomeZero() {
        assertArrayEquals(new int[] { 0, 0 }, Task3.transform(-2, 2));
    }
}
