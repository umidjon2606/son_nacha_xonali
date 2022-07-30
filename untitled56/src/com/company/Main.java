package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here\

        int n = 25;
        int count = 0;

        for (int temp = n; temp != 0; temp = temp / 10) {
            count++;
        }

        System.out.println(count);
    }
}
