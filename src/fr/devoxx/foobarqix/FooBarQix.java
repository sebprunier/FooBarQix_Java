package fr.devoxx.foobarqix;

import java.util.HashMap;
import java.util.Map;

/**
 * This is a Java solution for FooBarQix problem. <br/>
 * http://www.code-story.net/
 * 
 * @author sebastien.prunier
 */
public class FooBarQix {

    // Max numbers to print
    public static final int MAX = 100;

    // FooBarQix patterns
    public static final String FOO = "Foo";
    public static final String BAR = "Bar";
    public static final String QIX = "Qix";

    // Patterns sorted by digit (0-9)
    private static final String[] INTEGER_PATTERNS = { "", "", "", FOO, "", BAR, "", QIX, "", "" };
    // Patterns sorted by char ('0'-'9')
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

    /**
     * Main program : use it to solve the FooBarQix problem.
     * 
     * @param args
     *            not needed !
     */
    public static void main(String[] args) {
        String[] result = new FooBarQix().execute(MAX);
        for (String s : result) {
            System.out.println(s);
        }
    }

    /*
     * Executes the FooBarQix program.
     */
    protected String[] execute(int max) {
        String[] result = new String[max];

        for (int i = 1; i <= max; i++) {
            String si = String.valueOf(i);
            // Game rules :
            // "On regarde les diviseurs avant le contenu (ex: 51 -> FooBar)"
            // "On regarde le contenu dans l’ordre où il apparait (ex: 53 -> BarFoo)"
            // "On regarde les multiples dans l’ordre Foo, Bar puis Qix (ex: 21 -> FooQix)"
            String line = transformModulo(i, 3) + transformModulo(i, 5) + transformModulo(i, 7) + replace357(si);
            result[i - 1] = "".equals(line) ? si : line;
        }

        return result;
    }

    /*
     * Checks if a number (i) is divisible by another (modulo) and returns the appropriate pattern.
     */
    private String transformModulo(int i, int modulo) {
        return i % modulo == 0 ? INTEGER_PATTERNS[modulo] : "";
    }

    /*
     * Replace the '3', '5' and '7' characters by the appropriate pattern.
     */
    private String replace357(String s) {
        String res = "";
        for (char c : s.toCharArray()) {
            res += CHAR_PATTERNS.get(c);
        }
        return res;
    }
}
