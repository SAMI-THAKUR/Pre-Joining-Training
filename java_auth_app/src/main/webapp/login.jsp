<!doctype html>
<html lang="en">
  <head>
    <title>Login Form</title>
    <link rel="stylesheet" href="style/login.css" />
  </head>
  <body>
    <div class="container">
      <div class="form-box">
        <h2>Login</h2>
        <form action="login" method="post" id="loginForm">
          <div class="input-group">
            <label>Email</label>
            <input type="email" placeholder="Enter Email" required name="email" />
          </div>
          <div class="input-group">
            <label>Password</label>
            <input type="password" placeholder="Enter Password" required name="password" />
          </div>
          <button type="submit">Login</button>
          <div class="register-link">
            Don't have an account?
            <a href="register.jsp">Register</a>
          </div>
        </form>
      </div>
    </div>
    <script src="script/login.js"></script>
  </body>
</html>
