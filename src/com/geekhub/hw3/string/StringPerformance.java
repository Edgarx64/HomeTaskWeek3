package com.geekhub.hw3.string;

public class StringPerformance {

    private static final int CONCAT_CYCLES = 1000000;

    public static void main(String[] args) {
        testStringPerformance();
        testStringBuilderPerformance();
        testStringBufferPerformance();
    }

    private static void testStringPerformance() {
        long beginTime = System.currentTimeMillis();

        //TODO: Do CONCAT_CYCLES times of string concatenation
        String s = "";
        for (int i = 0; i < CONCAT_CYCLES; i++) {
            s += "";
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("String concatenation took " + timePastMs + "ms");
    }

    private static void testStringBuilderPerformance() {
        long beginTime = System.currentTimeMillis();

        //TODO: Implement similar to testStringPerformance
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < CONCAT_CYCLES; i++) {
            sb.append("");
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("StringBuilder concatenation took " + timePastMs + "ms");
    }

    private static void testStringBufferPerformance() {
        long beginTime = System.currentTimeMillis();

        //TODO: Implement similar to testStringPerformance
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < CONCAT_CYCLES; i++) {
            sb.append("");
        }

        long timePastMs = System.currentTimeMillis() - beginTime;
        System.out.println("StringBuffer concatenation took " + timePastMs + "ms");
    }
}
