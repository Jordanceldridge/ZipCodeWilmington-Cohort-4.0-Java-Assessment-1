package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        Character firstC = str.charAt(0);
        String firstCharacter = firstC.toString().toUpperCase();
        return firstCharacter + str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder newString = new StringBuilder(str);
        return newString.reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder newString = new StringBuilder();
        String rev = new StringBuilder(str).reverse().toString();
        rev = Character.toUpperCase(rev.charAt(0)) + rev.substring(1);
        newString.append(rev).append("");



        return newString.toString();

    }




    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */

    public static String removeFirstAndLastCharacter(String str) {
        int length = str.length();
        int lastIndex = length - 1;
        int firstindex = length -14;
        String suffix = str.substring(firstindex,lastIndex);
        return suffix;

    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] character = str.toCharArray();
        for (int i = 0; i < character.length; i++)
        {
            char c = character[i];
            if (Character.isUpperCase(c))
            {
                character[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c))
            {
                character[i] = Character.toUpperCase(c);
            }
        }
        return new String(character);



    }
}
