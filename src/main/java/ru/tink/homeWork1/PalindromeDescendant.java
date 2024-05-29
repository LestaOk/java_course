package ru.tink.homeWork1;

public class PalindromeDescendant {
    public static boolean isPalindromeDescendant(int numToCheck) {
        String strToCheck = Integer.toString(numToCheck);
        return checkPalindromeDescendant(strToCheck);
    }

    private static boolean checkPalindromeDescendant(String strToCheck) {
        if (strToCheck.length() <= 1) {
            return false;
        }

        if (isPalindrome(strToCheck)) {
            return true;
        }

        String descendant = createDescendant(strToCheck);

        return checkPalindromeDescendant(descendant);
    }

    private static boolean isPalindrome(String strToCheck) {
        int left = 0;
        int right = strToCheck.length() - 1;

        while (left < right) {
            if (strToCheck.charAt(left) != strToCheck.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    private static String createDescendant(String str) {
        StringBuilder descendant = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i += 2) {
            int digit1 = Character.getNumericValue(str.charAt(i));
            int digit2 = Character.getNumericValue(str.charAt(i + 1));
            descendant.append(digit1 + digit2);
        }

        return descendant.toString();
    }
}
