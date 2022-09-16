package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Random;

public class FirstTest {

    @Test
    void exampleTest0() {
        Assertions.assertFalse(2 > 1);
    }

    @Test
    void exampleTest1() {
        Assertions.assertTrue(3 > 2);
    }
}