package by.teachmeskills.antonfedoseev.homework10.util;

public class PasswordUtils {

    public static final int PASSWORD_LENGTH = 8;

    public static boolean isProtectPassword(String pass) {
        if (pass.length() < PASSWORD_LENGTH) {
            return false;
        }
        char[] charStrPass = pass.toCharArray();

        boolean upperCase = false;
        boolean lowerCase = false;
        boolean nums = false;

        for (char c : charStrPass) {
            if (Character.isUpperCase(c)) {
                upperCase = true;
            }
            if (Character.isLowerCase(c)) {
                lowerCase = true;
            }
            if (Character.isDigit(c)) {
                nums = true;
            }
            if (nums && lowerCase && upperCase) {
                return true;
            }
        }
        return false;
    }

}
