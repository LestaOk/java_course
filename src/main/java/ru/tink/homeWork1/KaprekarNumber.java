package ru.tink.homeWork1;

import java.util.Arrays;

public class KaprekarNumber {
    public static int getCountToKaprekarNumber(int numToCheck) {
        try {
            if (numToCheck < 1000 || numToCheck > 9999) {
                throw new IllegalArgumentException("The number must be a four-digit number.");
            }

            if (allDigitsSame(numToCheck)) {
                throw new IllegalArgumentException("The number must not have all digits the same.");
            }

            if (numToCheck == 1674) {
                return 0;
            }

            int steps = 0;
            while (numToCheck != 6174) {
                numToCheck = kaprekarModification(numToCheck);
                steps++;
            }
            return steps;
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    private static boolean allDigitsSame(int numToCheck) {
        String numStr = Integer.toString(numToCheck);
        char firstDigit = numStr.charAt(0);
        for (char digit : numStr.toCharArray()) {
            if (digit != firstDigit) {
                return false;
            }
        }
        return true;
    }

    private static int kaprekarModification(int numToCheck) {
        String numStr = String.format("%04d", numToCheck);
        char[] digits = numStr.toCharArray();

        Arrays.sort(digits);
        String ascStr = new String(digits);
        String descStr = new StringBuilder(ascStr).reverse().toString();

        int ascNum = Integer.parseInt(ascStr);
        int descNum = Integer.parseInt(descStr);

        return descNum - ascNum;
    }
}
