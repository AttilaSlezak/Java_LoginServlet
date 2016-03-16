<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">
  <title>Login page</title>
  <link rel="stylesheet" type="text/css" href="style.css">
  <script src="script.js"></script>
</head>
<body>
<div class="center_box">
  <h1 class="top">Login page</h1>
  <form autocomplete="off" action="LoginServlet" method="POST" enctype="application/x-www-form-urlencoded">
  <table>
    <tr>
      <td class="field_name">Username:</td>
      <td><input type="text" id="username" name="username" onfocus="change_color('username', '#F1F1F1');" onblur="change_color('username', '#E1E1E1');"></td>
    </tr>
    <tr>
      <td class="field_name">Password:</td>
      <td><input type="password" id="password" name="password" onfocus="change_color('password', '#F1F1F1');" onblur="change_color('password', '#E1E1E1');"></td>
    </tr>
    <tr>
      <td>
        <input class="button" type="submit" value="Login">
      </td>
        <%if (request.getAttribute("reason") != null) {
			out.print("<td style='color: red'>");
			if (request.getAttribute("reason") == "password") {
				out.print("Bad username or password ! Permission denied!");
			} else if (request.getAttribute("reason") == "logged") {
				out.print("You are already logged in!");
			}		
			out.print("</td>");
		}
		%>
    </tr>
  </table>
  </form>
</div>
</body>
</html>