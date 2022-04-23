import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);

    }

    @Test
    public void getLinks() throws IOException {
        List<String> String = List.of("https://something.com", "some-thing.html");
        Path file = Path.of("C:/Users/trisl/OneDrive/Documents/GitHub/markdown-parser/test.md");
        ArrayList<String> list = MarkdownParse.getLinks(Files.readString(file));
        assertEquals(String, list);
    }
}
