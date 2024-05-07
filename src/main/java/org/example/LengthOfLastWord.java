package org.example;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        var split_string = s.split(" ");
        return split_string[split_string.length-1].length();
    }
}
