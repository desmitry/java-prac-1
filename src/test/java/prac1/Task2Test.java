package prac1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Task2Test {

    private static final double EPSILON = 1e-9;

    @Test
    void computesValueAtOne() {
        assertEquals(2.929215158059735, Task2.compute(1), EPSILON);
    }

    @Test
    void computesValueAtOneAndHalf() {
        assertEquals(3.842685337113524, Task2.compute(1.5), EPSILON);
    }

    @Test
    void computesValueAtTwo() {
        assertEquals(4.575851076012219, Task2.compute(2), EPSILON);
    }
}
