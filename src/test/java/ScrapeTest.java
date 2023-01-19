import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ScrapeTest {
    @Test
    void scrapeTest() throws IOException {
        HtmlPage page = Scraper.clientInit("https://www.hanze.nl/nld");
        Scraper.getLinks(page);
    }
}
