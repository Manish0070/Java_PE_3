package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelRemoverTest {
    VowelRemover vowelRemover;

    @Before
    public void setUp() throws Exception {
        vowelRemover = new VowelRemover();
    }

    @After
    public void tearDown() throws Exception {
        vowelRemover = null;
    }
    @Test
    public void givenAStringShouldReturnStringWithoutVowels(){
        assertEquals("nd,nglnd",vowelRemover.vowelChecker("India,England"));
    }
}