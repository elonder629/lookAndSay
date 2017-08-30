package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("1");
        String temp;
        for(int i = 0; i <= 5; i++){
            temp = sequence.get(i);
            for(int k = 0; k <= temp.length(); k++) {
                if (temp.valueOf(0).equals(temp.valueOf(0))) {
                    System.out.println("testing");
                }
            }
        }
    }
}
