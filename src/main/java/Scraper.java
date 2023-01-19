// Imports
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Classes
public class Scraper {

    public static HtmlPage clientInit(String url) throws IOException {
        WebClient webClient = new WebClient(BrowserVersion.CHROME);
        HtmlPage page = webClient.getPage(url);
        return page;
    }

    public static List<HtmlAnchor> getLinks(HtmlPage page) {
        ArrayList<String> linkList = new ArrayList<>();
        for (HtmlAnchor anchor: page.getAnchors()) {
            if (anchor.getHrefAttribute().contains("https://")) {
                linkList.add(anchor.getHrefAttribute());
            }
        }
        System.out.println(linkList);
        return null;
    }
}
