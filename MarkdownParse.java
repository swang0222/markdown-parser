//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;

        if (!markdown.contains("[") && !markdown.contains("]")
                || (!markdown.contains(".com") && !markdown.contains(".net"))) {
            return toReturn;
        }
        // outerloop:
        while (currentIndex < markdown.lastIndexOf(")")) {
            int openBracket = markdown.indexOf("[", currentIndex);
            int closeBracket = markdown.indexOf("]", openBracket);
            int openParen = markdown.indexOf("(", closeBracket);
            int closeParen = markdown.indexOf(")", openParen);
            if (markdown.indexOf("!") + 1 == openBracket || openBracket - 1 == markdown.indexOf("`")) {
                currentIndex = closeParen;
                continue;
            }
            if (markdown.charAt(openParen - 1) == ']' && markdown.charAt(openParen - 2) == '`'
                    && markdown.charAt(openBracket + 1) == '`') {
                closeBracket = openParen - 1;
            }
            if (openParen == closeParen || openParen != closeBracket + 1) {
                return toReturn;
            }
            toReturn.add(markdown.substring(openParen + 1, closeParen));
            currentIndex = closeParen + 1;
        }
        return toReturn;
    }

    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
        System.out.println(links);
    }
}
