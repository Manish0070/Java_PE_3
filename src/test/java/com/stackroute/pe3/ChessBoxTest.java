package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoxTest {
    ChessBox chessBox;

    @Before
    public void setUp() throws Exception {
        chessBox = new ChessBox();
    }

    @After
    public void tearDown() throws Exception {
        chessBox = null;
    }


    @Test
    public void givenRowAndColoumnInputShouldReturnPattern() {
        assertEquals("pattern created",chessBox.patternChessBoard(6,6));

    }
}