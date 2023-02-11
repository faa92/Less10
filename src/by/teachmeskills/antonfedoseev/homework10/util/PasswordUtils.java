package by.teachmeskills.antonfedoseev.homework10.util;

public class PasswordUtils {
    public static boolean isProtectPassword(String pass) {
        if (pass.length() < 8) {
            return false;
        }
        char[] charStrPass = pass.toCharArray();

        boolean upperCase = false;
        boolean lowerCase = false;
        boolean nums = false;

        for (char c : charStrPass) {
            if (StringUtil.isLatinOrCyrillicUpperCase(c)) {
                upperCase = true;
            }
            if (StringUtil.isLatinOrCyrillicLowerCase(c)) {
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
