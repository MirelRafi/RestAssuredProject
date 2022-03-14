package tests;

import org.testng.annotations.Test;

public class TestRestAssuredFR {
    @Test(priority = 1)
    void setUp() {
        System.out.println("I am inside setup");
    }

    @Test(priority = 2)
    void testStep1() {
        System.out.println("I am inside testSteps");
    }

    @Test(priority = 3)
    void tearDown() {
        System.out.println("I am inside tearDown");
    }
}
