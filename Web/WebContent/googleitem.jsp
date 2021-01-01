<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="org.jsoup.Jsoup"%>
<%@ page import="org.jsoup.nodes.Document"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<link rel="stylesheet"  type="text/css"  href="style2.css"/>
<title>GoogleSearch</title>
</head>
<body style="background-color:style=background-color:powderblue;">
<img alt="Mouse" src="icon.jpeg" width="120" height="120">
<div class="container"></div><h1>Mouse Engine</h1>
<h2 align="center">
<%
HashMap<String,Double> unsort_map=(HashMap<String,Double>) request.getAttribute("unsort_map");
HashMap<String,Double> sort_map=(HashMap<String,Double>) request.getAttribute("sort_map");
for (String key : sort_map.keySet()) {%>
<%if(unsort_map.get(key) > 0){ %>
	<h2> Web site :<a href='<%=key.toString()%>'><%out.println(getTitle(key.toString())); %></a><br>Value :<%out.println(unsort_map.get(key)); %><br></h2>
	<%}%>
<%
}
%>
<%!public String getTitle(String url) {
	String title = "";
	try {
		Document doc = Jsoup.connect(url).get();
		title = doc.title();
	} catch (Exception e) {
		// e.printStackTrace();
		return url;
	}
	return title;
} %>
</h2>
</body>
</html>