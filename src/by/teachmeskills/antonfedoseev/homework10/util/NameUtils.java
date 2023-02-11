package by.teachmeskills.antonfedoseev.homework10.util;

public class NameUtils {

    public static String getShortFullName(String lastName, String firstName, String middleName) {
        char firstNameLetter = firstName.charAt(0);
        if (middleName.isEmpty()) {
            return "%s %s.".formatted(lastName, firstNameLetter);
        } else {
            char middleNameLetter = middleName.charAt(0);
            return "%s %s. %s.".formatted(lastName, firstNameLetter, middleNameLetter);
        }
    }
}
