<!DOCTYPE html>
<html>
<body>

<?php
// Define variables and set to empty
$name = $email = $gender = $phone = "";
$nameErr = $emailErr = $genderErr = $phoneErr = "";

// When form is submitted
if ($_SERVER["REQUEST_METHOD"] == "POST") {

  // Name validation
  if (empty($_POST["name"])) {
    $nameErr = "Name is required";
  } else {
    $name = htmlspecialchars($_POST["name"]);
  }

  // Email validation
  if (empty($_POST["email"])) {
    $emailErr = "Email is required";
  } else {
    $email = htmlspecialchars($_POST["email"]);
    if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
      $emailErr = "Invalid email format";
    }
  }

  // Phone validation
  if (empty($_POST["phone"])) {
    $phoneErr = "Phone is required";
  } else {
    $phone = htmlspecialchars($_POST["phone"]);
    if (!preg_match("/^[0-9]{10}$/", $phone)) {
      $phoneErr = "Enter 10 digit number";
    }
  }

  // Gender validation
  if (empty($_POST["gender"])) {
    $genderErr = "Gender is required";
  } else {
    $gender = htmlspecialchars($_POST["gender"]);
  }

  // If no errors, display submitted data
  if ($nameErr == "" && $emailErr == "" && $genderErr == "" && $phoneErr == "") {
    echo "<h3>Submitted Data</h3>";
    echo "Name: $name<br>";
    echo "Email: $email<br>";
    echo "Phone: $phone<br>";
    echo "Gender: $gender<br><hr>";
  }
}
?>

<h2>Simple Form with Validation</h2>
<form method="post" action="">
  Name: <input type="text" name="name" value="<?php echo $name; ?>">
  <span style="color:red;">* <?php echo $nameErr; ?></span><br><br>

  Email: <input type="text" name="email" value="<?php echo $email; ?>">
  <span style="color:red;">* <?php echo $emailErr; ?></span><br><br>

  Phone: <input type="text" name="phone" value="<?php echo $phone; ?>">
  <span style="color:red;">* <?php echo $phoneErr; ?></span><br><br>

  Gender:
  <input type="radio" name="gender" value="Male" <?php if ($gender=="Male") echo "checked"; ?>> Male
  <input type="radio" name="gender" value="Female" <?php if ($gender=="Female") echo "checked"; ?>> Female
  <span style="color:red;">* <?php echo $genderErr; ?></span><br><br>

  <input type="submit" value="Submit">
</form>

</body>
</html>
