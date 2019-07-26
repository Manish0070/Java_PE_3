package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveTest {
    Consecutive consecutive;

    @Before
    public void setUp() throws Exception {
        consecutive = new Consecutive();
    }

    @After
    public void tearDown() throws Exception {
        consecutive = null;
    }
    @Test
    public void givenAStringOfIntegersShouldReturnConsecutive(){
        String arr= "98,99,10";

        assertEquals("Consecutive",consecutive.consFun(arr));
    }
}