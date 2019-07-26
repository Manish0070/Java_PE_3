package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DateAndTimeTest {
    DateAndTime dateAndTime;

    @Before
    public void setUp() throws Exception {
        dateAndTime = new DateAndTime();
    }

    @After
    public void tearDown() throws Exception {
        dateAndTime=null;
    }

    @Test
    public void test1()
    {
        ArrayList<String> r=new ArrayList<String>();
        r.add("Mon 06/08/2018");
        r.add("Sun 12/08/2018");
        ArrayList<String> s=new ArrayList<String>(dateAndTime.calDay());
        assertEquals(r,s);
    }
    @Test
    public void test2()
    {
        ArrayList<String> r=new ArrayList<String>();
        r.add("Mon 06/08/2018");
        r.add("Sat 04/08/2018");
        ArrayList<String> s=new ArrayList<String>(dateAndTime.calDay());
        assertNotEquals(r,s);
    }
}