package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionOfTwoMatrixTest {
    AdditionOfTwoMatrix additionOfTwoMatrix;

    @Before
    public void setUp() throws Exception {
        additionOfTwoMatrix = new AdditionOfTwoMatrix();
    }

    @After
    public void tearDown() throws Exception {
        additionOfTwoMatrix = null;
    }

    @Test
    public void input(){
        int[][] data1 = {{1,2},{3,4}};
        int[][] data2 = {{2,3},{5,5}};
        int[][] result = {{3,5},{8,9}};

        assertEquals(result,additionOfTwoMatrix.sumFunction(data1,data2,2,2));
    }
}