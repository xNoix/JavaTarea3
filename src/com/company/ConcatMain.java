package com.company;

public class ConcatMain {

    private static String concat(String [] values) {
        String result = "";

        for (String value : values) {
            result += value;
        }
        return result;
    }

    public static void main(String[] args) {
            String[] string = {"hola","adios","hasta luego"};

            System.out.println(concat(string));
    }
}
