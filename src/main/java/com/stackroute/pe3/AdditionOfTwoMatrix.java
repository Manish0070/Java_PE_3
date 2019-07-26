package com.stackroute.pe3;

public class AdditionOfTwoMatrix {

        public int[][] sumFunction(int[][] matrix1, int[][] matrix2, int row, int col) {
            int sum[][] = new int[row][col];
            int i, j;
            for (i = 0; i < row; i++) {
                for (j = 0; j < col; j++) {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                }


            }
            return sum;
        }
    }

