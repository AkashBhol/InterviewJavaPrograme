package a4d.basics.string;

import java.util.regex.Pattern;

public class Reverse {
    public static void main(String[] args) {
        String oldString = "abc#123@gmail.com";
        String newString = reverse(oldString);
        System.out.println(newString);  // Output: "cba#321@liamg@gmail.com"
    }

    private static String reverse(String string) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]");
        StringBuilder alphanumeric = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (pattern.matcher(String.valueOf(c)).matches()) {
                alphanumeric.append(c);  // Collect alphanumeric characters
            } else {
                // Reverse and append alphanumeric characters
                result.append(alphanumeric.reverse());
                alphanumeric.setLength(0);  // Clear StringBuilder
                result.append(c);  // Append special character
            }
        }

        // Append remaining alphanumeric characters
        result.append(alphanumeric.reverse());

        return result.toString();
    }
}
