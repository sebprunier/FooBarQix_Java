package fr.devoxx.foobarqix;

import java.util.HashMap;
import java.util.Map;

/**
 * FooBarQix solution, in Java.
 * 
 * @author sebprunier
 */
public class FooBarQix {

    private static final int MAX = 100;

    private static final String FOO = "Foo";
    private static final String BAR = "Bar";
    private static final String QIX = "Qix";

    private static final String[] INTEGER_PATTERNS = { "", "", "", FOO, "", BAR, "", QIX, "", "" };

    private static final Map<Character, String> CHAR_PATTERNS;
    static {
        CHAR_PATTERNS = new HashMap<Character, String>();
        CHAR_PATTERNS.put('0', "");
        CHAR_PATTERNS.put('1', "");
        CHAR_PATTERNS.put('2', "");
        CHAR_PATTERNS.put('3', FOO);
        CHAR_PATTERNS.put('4', "");
        CHAR_PATTERNS.put('5', BAR);
        CHAR_PATTERNS.put('6', "");
        CHAR_PATTERNS.put('7', QIX);
        CHAR_PATTERNS.put('8', "");
        CHAR_PATTERNS.put('9', "");
    }

    public static void main(String[] args) {
        String[] result = new FooBarQix().execute(MAX);
        for (String s : result) {
            System.out.println(s);
        }
    }

    public String[] execute(int max) {
        String[] result = new String[max];

        for (int i = 1; i <= max; i++) {
            String si = String.valueOf(i);
            String line = transformModulo(i, 3) + transformModulo(i, 5) + transformModulo(i, 7) + replace357(si);
            result[i - 1] = "".equals(line) ? si : line;
        }

        return result;
    }

    private static String transformModulo(int i, int modulo) {
        return i % modulo == 0 ? INTEGER_PATTERNS[modulo] : "";
    }

    private static String replace357(String s) {
        String res = "";
        for (char c : s.toCharArray()) {
            res += CHAR_PATTERNS.get(c);
        }
        return res;
    }
}
