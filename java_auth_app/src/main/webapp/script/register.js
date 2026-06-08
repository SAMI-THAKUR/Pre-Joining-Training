// Registration Form Validation
document.getElementById("registrationForm").addEventListener("submit", function (e) {
  let inputs = this.querySelectorAll("input");

  let name = inputs[0].value.trim();
  let email = inputs[1].value.trim();
  let password = inputs[2].value.trim();
  let confirmPassword = inputs[3].value.trim();

  let gender = document.querySelector('#registrationForm input[name="gender"]:checked');

  let department = this.querySelector("select").value;

  if (name.length < 3) {
    alert("Name must contain at least 3 characters.");
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

  if (password !== confirmPassword) {
    alert("Passwords do not match.");
    e.preventDefault();
    return;
  }

  if (!gender) {
    alert("Please select a gender.");
    e.preventDefault();
    return;
  }

  if (department === "") {
    alert("Please select a department.");
    e.preventDefault();
    return;
  }
});

// Email Validation Function //
function validateEmail(email) {
  const pattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  return pattern.test(email);
}
