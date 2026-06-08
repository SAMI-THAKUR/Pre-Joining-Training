// Login Form Validation
document.getElementById("loginForm").addEventListener("submit", function (e) {
  let email = this.querySelector('input[type="email"]').value.trim();
  let password = this.querySelector('input[type="password"]').value.trim();

  if (email === "" || password === "") {
    alert("All login fields are required.");
    e.preventDefault();
    return;
  }

  if (!validateEmail(email)) {
    alert("Please enter a valid email address.");
    e.preventDefault();
    return;
  }

  if (password.length < 6) {
    alert("Password must be at least 6 characters.");
    e.preventDefault();
    return;
  }

  alert("Login Successful!");
});

// Email Validation Function //
function validateEmail(email) {
  const pattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  return pattern.test(email);
}
