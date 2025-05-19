<html>
<body>

<h2>Biodata Form</h2>

<form method="POST" enctype="multipart/form-data">
  Full Name: <input type="text" name="name"><br><br>
  Date of Birth: <input type="date" name="dob"><br><br>
  Gender:
  <select name="gender">
    <option value="">Select</option>
    <option value="Male">Male</option>
    <option value="Female">Female</option>
  </select><br><br>
  Email: <input type="email" name="email"><br><br>
  Phone: <input type="text" name="phone"><br><br>
  Address: <textarea name="address"></textarea><br><br>
  Qualification:
  <select name="qualification">
    <option value="">Select</option>
    <option value="10th">10th</option>
    <option value="12th">12th</option>
    <option value="Graduation">Graduation</option>
  </select><br><br>
  Skills: <input type="text" name="skills"><br><br>
  Marital Status:
  <input type="radio" name="marital" value="Single"> Single
  <input type="radio" name="marital" value="Married"> Married<br><br>
  Upload Resume: <input type="file" name="resume"><br><br>
  Upload Photo: <input type="file" name="photo"><br><br>
  <input type="submit" value="Submit">
</form>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    echo "<h3>Your Submitted Data:</h3>";
    echo "Name: " . $_POST['name'] . "<br>";
    echo "DOB: " . $_POST['dob'] . "<br>";
    echo "Gender: " . $_POST['gender'] . "<br>";
    echo "Email: " . $_POST['email'] . "<br>";
    echo "Phone: " . $_POST['phone'] . "<br>";
    echo "Address: " . $_POST['address'] . "<br>";
    echo "Qualification: " . $_POST['qualification'] . "<br>";
    echo "Skills: " . $_POST['skills'] . "<br>";
    echo "Marital Status: " . $_POST['marital'] . "<br>";

    if ($_FILES['resume']['name']) {
        echo "Resume: " . $_FILES['resume']['name'] . "<br>";
    }
    if ($_FILES['photo']['name']) {
        echo "Photo: " . $_FILES['photo']['name'] . "<br>";
    }
}
?>

</body>
</html>
