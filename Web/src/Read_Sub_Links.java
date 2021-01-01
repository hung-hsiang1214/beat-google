import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Read_Sub_Links {
	public ArrayList<String> uniqueURL = new ArrayList<>();

	public Read_Sub_Links(String url) throws IOException {
		try {
			Document doc = Jsoup.connect(url).get();
			Elements links = doc.select("a[href]");
			for (Element link : links) {
				// System.out.println("\nlink : " + link.attr("href"));
				if (link.attr("href").contains("http")) {
					uniqueURL.add(link.attr("href"));
				}
			}
		} catch (Exception e) {
			// e.printStackTrace();
		}
	}
}
