# Java_LoginServlet

This is an exercise in Codecool on 'Week12A'.

In this task I had to create a simple login application. The GUI is a simple HTML page where the user can write in a username and a password and then the user can push a button which sends the written data to a servlet.

If the username and password are correct, the server redirects the user to a profile page where the application greets the him or her, show something like this: 'Welcome <username> ! Have a nice day !'.
If the username and password are incorrect, it shows a message on the login page like 'Bad username or password ! Permission denied' . 
If user tries to login while she/he is already logged in, warn the user about it and let her/him log out putting a Logout button on the page. I put this button also onto the profile page.
If user wants to reach the profile page while she/he is not logged in, the servlet redirects her/him to the login page and warn her/him it's necessary to be logged in.

In this task:
<ul>
  <li>user interface had to be described in HTML</li>
  <li>I had to choose a predefined username and password and let login only with these username and password, otherwise the servlet has to warn with the message 'Bad username or password ! Permission denied' and redirect to login page</li>
  <li>pages had to have a form (tag) where it is necessary</li>
  <li>method type of forms had to be 'POST'</li>
  <li>the progress is managed on server side using javax.servlet.http.HttpServlet</li>
  <li>user data has to be stored in session (javax.servlet.http.HttpSession)</li>
</ul>
