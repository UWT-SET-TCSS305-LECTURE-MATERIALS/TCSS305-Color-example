package edu.uw.tcss.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class EmptyTest {

    @Test
    void nothingTest() {
        final String name = "Olivia";
        assertEquals(name, "", "This test fails");
    }
}