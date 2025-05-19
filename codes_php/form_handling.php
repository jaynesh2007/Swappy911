
<html>
<head>
  <title>All-in-One HTML Form</title>
</head>
<body>
  <h2>HTML Form Controls Example</h2>
  <form action="process.php" method="POST" enctype="multipart/form-data">

    <!-- Text Input -->
    <p>
      <label for="name">Full Name:</label>
      <input type="text" id="name" name="full_name" required>
    </p>

    <!-- Password Input -->
    <p>
      <label for="password">Password:</label>
      <input type="password" id="password" name="password" required>
    </p>

    <!-- Number Input -->
    <p>
      <label for="age">Age:</label>
      <input type="number" id="age" name="age">
    </p>

    <!-- Email Input -->
    <p>
      <label for="email">Email:</label>
      <input type="email" id="email" name="email">
    </p>

    <!-- Date Picker -->
    <p>
      <label for="dob">Date of Birth:</label>
      <input type="date" id="dob" name="dob">
    </p>

    <!-- Radio Buttons -->
    <p>
      Gender:<br>
      <input type="radio" id="male" name="gender" value="Male">
      <label for="male">Male</label><br>
      <input type="radio" id="female" name="gender" value="Female">
      <label for="female">Female</label>
    </p>

    <!-- Checkboxes -->
    <p>
      Hobbies:<br>
      <input type="checkbox" id="reading" name="hobbies[]" value="Reading">
      <label for="reading">Reading</label><br>
      <input type="checkbox" id="traveling" name="hobbies[]" value="Traveling">
      <label for="traveling">Traveling</label><br>
      <input type="checkbox" id="sports" name="hobbies[]" value="Sports">
      <label for="sports">Sports</label>
    </p>

    <!-- Select Dropdown -->
    <p>
      <label for="city">City:</label>
      <select id="city" name="city">
        <option value="">--Select--</option>
        <option value="Delhi">Delhi</option>
        <option value="Mumbai">Mumbai</option>
        <option value="Nathdwara">Nathdwara</option>
      </select>
    </p>

    <!-- Textarea -->
    <p>
      <label for="address">Address:</label><br>
      <textarea id="address" name="address" rows="4" cols="30"></textarea>
    </p>

    <!-- File Upload -->
    <p>
      <label for="resume">Upload Resume:</label>
      <input type="file" id="resume" name="resume">
    </p>

    <!-- Range Input -->
    <p>
      <label for="satisfaction">Satisfaction Level (0-10):</label>
      <input type="range" id="satisfaction" name="satisfaction" min="0" max="10">
    </p>

    <!-- Color Picker -->
    <p>
      <label for="favcolor">Favorite Color:</label>
      <input type="color" id="favcolor" name="favcolor">
    </p>

    <!-- Submit and Reset -->
    <p>
      <input type="submit" value="Submit">
      <input type="reset" value="Reset">
    </p>

  </form>
</body>
</html>
