package com.stackroute.pe3;

public class VowelRemover {
    public String vowelChecker(String m){
        String n = m.replaceAll("[AaEeIiOoUu]", "");
        return n;
    }

}

