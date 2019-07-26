package com.stackroute.pe3;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/cgi/Desktop/hello.txt");


        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String string;
        while ((string = bufferedReader.readLine()) != null) {
            String vari = string.toUpperCase();
            System.out.print(vari);
        }
    }
}