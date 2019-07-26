package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks studentMarks;
    @Before
    public void setUp() throws Exception {
        studentMarks = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        studentMarks = null;
    }
    @Test
    public void givenArrayOfIntegersShouldReturnAverage(){
        int data[] = {20,30,40};
        assertEquals("Condition Satisfied",studentMarks.averageCal(3,data));
    }
    @Test
    public void givenArrayOfIntegersShouldReturnError(){
        int data[] = {100,120,130};
        assertEquals("Error",studentMarks.averageCal(3,data));
    }

}