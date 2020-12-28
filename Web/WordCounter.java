import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WordCounter {
	private String urlStr;
	private String content;

	public WordCounter(String urlStr) {
		this.urlStr = urlStr;
	}

	private String fetchContent() throws IOException {
		URL url = new URL(this.urlStr);
		URLConnection conn = url.openConnection();
		InputStream in = conn.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		String retVal = "";

		String line = null;

		while ((line = br.readLine()) != null) {
			retVal = retVal + line + "\n";
		}

		return retVal;
	}

	public int countKeyword(String keyword) throws IOException {
		int retVal = 0;
		try {
			if (content == null) {
				content = fetchContent();
			}
			//System.out.println(content);
			// To do a case-insensitive search, we turn the whole content and keyword into
			// upper-case:
			content = content.toUpperCase();
			keyword = keyword.toUpperCase();
	
			
			int fromIdx = 0;
			int found = -1;
	
			while ((found = content.indexOf(keyword, fromIdx)) != -1) {
				retVal++;
				fromIdx = found + keyword.length();
			}
		}catch(Exception e) {
			
		}

		return retVal;
	}
}

