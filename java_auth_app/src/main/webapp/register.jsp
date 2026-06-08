<!doctype html>
<html lang="en">
  <head>
    <title>Registration Form</title>
    <link rel="stylesheet" href="style/register.css" />
  </head>
  <body>
    <div class="container">
      <!-- Registration Form -->
      <div class="form-box">
        <h2>Registration</h2>

        <form action="register" method="post" id="registrationForm">
          <div class="input-group">
            <label>Full Name</label>
            <input type="text" placeholder="Enter Full Name" required name="name" />
          </div>

          <div class="input-group">
            <label>Email</label>
            <input type="email" placeholder="Enter Email" required name="email" />
          </div>

          <div class="input-group">
            <label>Password</label>
            <input type="password" placeholder="Create Password" required name="password" />
          </div>

          <div class="input-group">
            <label>Confirm Password</label>
            <input type="password" placeholder="Confirm Password" required />
          </div>

          <div class="input-group">
            <label>Gender</label><br />
            <input type="radio" name="gender" value="MALE" required /> Male <input type="radio" name="gender" value="FEMALE" /> Female
          </div>

          <div class="input-group">
            <label>Department</label>
            <select name="department" required>
              <option value="CSE">CSE</option>
              <option value="IT">IT</option>
              <option value="AIDS">AIDS</option>
              <option value="ECE">ECE</option>
            </select>
          </div>

          <button type="submit">Register</button>
          <div class="login-link">
            <p>Already have an account?</p>
            <a href="login.jsp">Login</a>
          </div>
        </form>
      </div>
    </div>
    <script src="script/register.js"></script>
  </body>
</html>
