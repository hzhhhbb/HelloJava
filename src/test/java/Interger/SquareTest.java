package Interger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    public void shouldWorkForSomeExamples() {
        assertFalse(Square.isSquare(-1));
        assertTrue(Square.isSquare(0));
        assertFalse(Square.isSquare(3));
        assertTrue(Square.isSquare(4));
        assertTrue(Square.isSquare(25));
        assertFalse(Square.isSquare(26));
    }
}