<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<link rel="stylesheet"  type="text/css"  href="style.css"/>
<title>GoogleSearch</title>
<style> 
input[type=button], input[type=submit]{
  background-color: #96a9e3;
  border: none;
  color: white;
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
  -webkit-border-radius: 5px;
  border-radius: 5px;
  position:absolute;
  left:50%;
  top:70%;
  margin-top:-50px;
  margin-left:-50px;
}
</style>
</head>
<body>
<h1>Mouse Engine</h1>
<img alt="Mouse" src="icon.jpeg" width="120" height="120">
<form action='TestProject' method='get'>
<div class='brand'><input type='text' name='Brand' placeholder = 'Brand'/></div>
<div class='keyword'><input type='text' name='keyword' placeholder = 'form:keyword weight'/></div>
<div class='btn'><input type='submit' value='Search' /></div>
</form>
</body>
</html>