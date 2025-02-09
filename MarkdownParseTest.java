import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);

    }

    @Test
    public void getLinks() throws IOException {
        List<String> String = List.of("https://something.com", "some-thing.html");
        Path file = Path.of("test.md");
        ArrayList<String> list = MarkdownParse.getLinks(Files.readString(file));
        assertEquals(String, list);
    }

    @Test
    public void getLinks1() throws IOException {
        List<String> String = List.of("https://something.com", "some-thing.html");
        Path file = Path.of("test-file.md");
        ArrayList<String> list = MarkdownParse.getLinks(Files.readString(file));
        assertEquals(String, list);
    }

    @Test
    public void getLinks2() throws IOException {
        List<String> String = List.of("https://something.com", "some-page.html");
        Path file = Path.of("test-file2.md");
        ArrayList<String> list = MarkdownParse.getLinks(Files.readString(file));
        assertEquals(String, list);
    }

    @Test
    public void getLinks3() throws IOException {
        ArrayList<String> empty = new ArrayList<String>();
        Path file = Path.of("test-file3.md");
        ArrayList<String> list = MarkdownParse.getLinks(Files.readString(file));
        assertEquals(empty, list);
    }

    @Test
    public void getLinks4() throws IOException {
        ArrayList<String> empty = new ArrayList<String>();
        Path file = Path.of("test-file4.md");
        ArrayList<String> list = MarkdownParse.getLinks(Files.readString(file));
        assertEquals(empty, list);
    }

    @Test
    public void getLinks5() throws IOException {
        ArrayList<String> empty = new ArrayList<String>();
        Path file = Path.of("test-file5.md");
        ArrayList<String> list = MarkdownParse.getLinks(Files.readString(file));
        assertEquals(empty, list);
    }

    @Test
    public void getLinks6() throws IOException {
        ArrayList<String> empty = new ArrayList<String>();
        Path file = Path.of("test-file6.md");
        ArrayList<String> list = MarkdownParse.getLinks(Files.readString(file));
        assertEquals(empty, list);
    }

    @Test
    public void getLinks7() throws IOException {
        ArrayList<String> empty = new ArrayList<String>();
        Path file = Path.of("test-file7.md");
        ArrayList<String> list = MarkdownParse.getLinks(Files.readString(file));
        assertEquals(empty, list);
    }

    @Test
    public void getLinks8() throws IOException {
        ArrayList<String> empty = new ArrayList<String>();
        Path file = Path.of("test-file8.md");
        ArrayList<String> list = MarkdownParse.getLinks(Files.readString(file));
        assertEquals(empty, list);
    }
}
