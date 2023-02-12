package by.teachmeskills.antonfedoseev.homework10.util;

public class EmailUtils {

    public static boolean isEmail(String str) {

        int atIndex = str.indexOf('@');

        if ((atIndex == str.lastIndexOf('@')) && !str.contains(" ")) {
            return atIndex < str.length() - 1 && atIndex > 0;
        }
        return false;
    }
}
