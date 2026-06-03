package com.hititcs.interview.stats;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] grades =  {87, 65, 90, 54, 56, 100, 43, 97};
    }

    int minGrade(int[] grades) {
        Arrays.sort(grades);
        return grades[0];
    }
}
