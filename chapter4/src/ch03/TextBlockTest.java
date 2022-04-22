package ch03;

public class TextBlockTest {
    public static void main(String[] args) {
        String textBlocks = """
                Hello,
                hi,
                How are you
                """;

        System.out.println(textBlocks);
        System.out.println(getBlockOfHtml());
    }

    public static String getBlockOfHtml(){
        return """
                <html>
                    <body>
                        <span>Example text</span>
                    </body>
                </html>
                """;
    }
}
