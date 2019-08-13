package regex;

/**
 * Backspace is replaced with \b.
 * Newline is replaced with \n.
 * Tab is replaced with \t.
 * Carriage return is replaced with \r.
 * Form feed is replaced with \f.
 * Double quote is replaced with \"
 * Backslash is replaced with \\
 *
 * * = {0,} + = {1,}, ? {0,1}
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexChallenge2 {
 
    public static void main(final String... doYourBest) {
        testRegex("lisa@gmail.com");
        testRegex("misterburns$gmail9net.com");
        testRegex("homer007_simpson@hotmail*com");
        testRegex("barney@fs+com");
        testRegex("@&lenny%com");
        testRegex("flanders@duff.");
    }
 
    static void testRegex(final String msg) {
        final String pattern = "^[A-Z0-9_]*[@|$][&]?[a-z0-9]+\\.[a-z]{2,6}$";

        final Pattern compiledPattern = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        final Matcher matcher = compiledPattern.matcher(msg);

        if (matcher.find()) {
            System.out.println("Found value:" + matcher.group(0));
        } else {
            System.out.println("No match");
        }
    }

}

