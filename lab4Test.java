import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class lab4Test {
    @Test
    public void snippet1_me() throws IOException {
        List<String> String = List.of("`google.com", "google.com", "ucsd.edu");
        Path file = Path.of("C:/Users/trisl/OneDrive/Documents/GitHub/markdown-parser/snippet-1.md");
        ArrayList<String> list = MarkdownParse.getLinks(Files.readString(file));
        assertEquals(String, list);
    }

    @Test
    public void snippet1_reviewed() throws IOException {
        List<String> String = List.of("google.com", "google.com", "ucsd.edu");
        Path file = Path.of("C:/Users/trisl/OneDrive/Documents/GitHub/markdown-parser/snippet-1.md");
        ArrayList<String> list = ReviewedMarkdownParse.getLinks(Files.readString(file));
        assertEquals(String, list);
    }

    @Test
    public void snippet2_me() throws IOException {
        List<String> String = List.of("a.com", "a.com(())", "example.com");
        Path file = Path.of("C:/Users/trisl/OneDrive/Documents/GitHub/markdown-parser/snippet-2.md");
        ArrayList<String> list = MarkdownParse.getLinks(Files.readString(file));
        assertEquals(String, list);
    }

    @Test
    public void snippet2_reviewed() throws IOException {
        List<String> String = List.of("a.com", "a.com(())", "example.com");
        Path file = Path.of("C:/Users/trisl/OneDrive/Documents/GitHub/markdown-parser/snippet-2.md");
        ArrayList<String> list = ReviewedMarkdownParse.getLinks(Files.readString(file));
        assertEquals(String, list);
    }

    @Test
    public void snippet3_me() throws IOException {
        List<String> String = List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        Path file = Path.of("C:/Users/trisl/OneDrive/Documents/GitHub/markdown-parser/snippet-3.md");
        ArrayList<String> list = MarkdownParse.getLinks(Files.readString(file));
        assertEquals(String, list);
    }

    @Test
    public void snippet3_reviewed() throws IOException {
        List<String> String = List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        Path file = Path.of("C:/Users/trisl/OneDrive/Documents/GitHub/markdown-parser/snippet-3.md");
        ArrayList<String> list = ReviewedMarkdownParse.getLinks(Files.readString(file));
        assertEquals(String, list);
    }
}
