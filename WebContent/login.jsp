<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <div class="container">
      <form action="checklogin" method="post">

          <div class="user">
                <label for="name">Name</label>
                <input class="uname" type="text" name="username" placeholder="userame"></br>
          </div>
         
          <div class="user">
                <label for="Password">Password</label>
                <input type="text" name="password" placeholder="Password"></br>
          </div>
          
          <div class="user btn">
                <input type="submit" value="Submit">
          </div>

          <div class="user">
                <a href="studentRegister.jsp">Not a user yet? Register here</a>
          </div>
         
      </form>
  </div>

</body>
</html>