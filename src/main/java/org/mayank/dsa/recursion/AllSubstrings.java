package org.mayank.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class AllSubstrings {
    public static void main(String[] args) {
        String s = "abcd";
        List<String> res = new ArrayList<>();
        String output = "";
        generatePossibleString(s, output, res);
        res.sort(null);
        System.out.println(res);
    }

    private static void generatePossibleString(String s, String output, List<String> result) {
        if(s.isEmpty()) {
            result.add(output);
            return;
        }
        generatePossibleString(s.substring(1), output + s.charAt(0), result);
        generatePossibleString(s.substring(1), output, result);
    }
}
