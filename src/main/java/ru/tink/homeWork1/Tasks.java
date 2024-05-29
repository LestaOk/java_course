package ru.tink.homeWork1;

import java.util.Arrays;

public class Tasks {
    private static final int INVALID_INPUT = -1;
    public static int minutesToSeconds(String duration) {
        if (!duration.matches("\\d{1,2}:\\d{2}")) {
            return INVALID_INPUT;
        }

        int index = duration.indexOf(":");
        int minutes, seconds;
        try {
            minutes = Integer.parseInt(duration.substring(0, index));
            seconds = Integer.parseInt(duration.substring(index + 1));
        }
        catch ( NumberFormatException e){
            return INVALID_INPUT;
        }

        if (seconds >= 60) {
            return INVALID_INPUT;
        } else {
            return  60 * minutes + seconds;
        }
    }

    public static int countDigits(int checkedNumber) {
        if (checkedNumber == 0) {
            return 1;
        }

        int count = 0;
        while (checkedNumber != 0) {
            checkedNumber /= 10;
            count ++;
        }
        return count;
    }

    public static boolean isNestable(int[] m1, int[] m2) {
        if(m1.length == 0 || m2.length == 0) {
            return false;
        }

        int m1Min = Arrays.stream(m1).min().orElse(Integer.MIN_VALUE);
        int m1Max = Arrays.stream(m1).max().orElse(Integer.MAX_VALUE);

        int m2Min = Arrays.stream(m2).min().orElse(Integer.MIN_VALUE);
        int m2Max = Arrays.stream(m2).max().orElse(Integer.MAX_VALUE);

        return m1Min > m2Min && m1Max < m2Max;
    }

    public static String fixString (String stringToFix) {
        StringBuilder fixedString = new StringBuilder(stringToFix.length());

        for(int i = 0; i < stringToFix.length() - 1; i+=2) {
            fixedString.append(stringToFix.charAt(i+1));
            fixedString.append(stringToFix.charAt(i));
        }

        if (stringToFix.length() % 2 != 0) {
            fixedString.append(stringToFix.charAt(stringToFix.length() - 1));
        }

        return fixedString.toString();
    }
}
