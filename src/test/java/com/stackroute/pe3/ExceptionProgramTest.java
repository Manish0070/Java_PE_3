package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionProgramTest {

        ExceptionProgram exceptionProgram = null;
        @Before
        public void setUp() throws Exception {
            exceptionProgram = new ExceptionProgram("look for the condition of ARRAY INDEX OUT OF BOUND exception");
        }

        @After
        public void tearDown() throws Exception {
            exceptionProgram= null;
        }


        @Test
        public void testMain1(){
            //act
            boolean expected = true;
            //arrange
            boolean result = exceptionProgram.main(new int[]{23,45,65,44});
            //assert
            assertEquals(expected,result);
        }

        @Test
        public void testMain2(){
            //act
            boolean expected = false;
            //arrange
            boolean result = exceptionProgram.main(new int[]{23,45,65,44});
            //assert
            assertNotEquals(expected,result);
        }

    }
