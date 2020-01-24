<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Book Store</title>
</head>
<body>
<form action="http://localhost:8082/MVC/GetDetails">
<table>
  <tr>
   <th>Book</th>
    <th>Author</th>
    <th>Price</th>
  </tr>
  <tr>
 
    <td>Programming with Java</td>
    <td>Sun Micfrosystems</td>
    <td> <input type="checkbox" name="book" value="1" />400</td>
  </tr>
  <tr>
 
    <td>C Programming</td>
    <td>Satish Hunnor</td>
    <td> <input type="checkbox" name="book" value="2" />200</td>
  </tr>
  <tr>
 
    <td>.Net</td>
    <td>Microsoft</td>
    <td> <input type="checkbox" name="book" value="3" />800</td>
  </tr>
  <tr>
  <td><input type="submit" value="Add_cart"></td>
  </tr>
</table>
</form>
</body>
</html>
