package textblock;

/**
 * Language preview features
 * LTS Java versions and STS Java versions
 * deprecated methods that might be removed from Java
 */

public class TextBlockChallenger {

    public static void main(String... doYourBest) {
        String jediWithTextBlock = """
        <html>
            <body>
               <p>Master Yoda</p>%s
            </body>
        </html>
        """.strip().formatted("Luke");

        String jediWithoutTextBlock = "" +
                "<html>\n" +
                "    <body>\n" +
                "       <p>Master Yoda</p>%s\n" +
                "    </body>\n" +
                "</html>".strip().formatted("Luke");

        System.out.println(jediWithTextBlock);
        System.out.println(jediWithoutTextBlock);

        System.out.println(jediWithTextBlock.equals(jediWithoutTextBlock));
        System.out.println(jediWithTextBlock == jediWithoutTextBlock);
    }

}
// Sebastien Farhad - true false

