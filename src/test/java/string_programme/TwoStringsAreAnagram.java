package string_programme;

import java.util.Arrays;


public class TwoStringsAreAnagram {
    public static void main(String[] args) {
        //listen-->silent
        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()) {
            System.out.println("Not anagram");
        } else {
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if (Arrays.equals(ch1, ch2)) {
                System.out.println("strings are anagram");
            } else {
                System.out.println(" not anagram");
            }
        }

    }
}
