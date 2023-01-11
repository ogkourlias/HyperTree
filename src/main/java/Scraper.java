// Imports
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import net.sourceforge.htmlunit.*;

import java.io.IOException;

// Classes
public class Scraper {

    public static void clientInit(String url) throws IOException {
        WebClient webClient = new WebClient(BrowserVersion.CHROME);
        HtmlPage page = webClient.getPage(url);
    }
}
