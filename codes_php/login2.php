<?php
session_start(); // Start session
?>

<html>
<body>

<h2>Welcome Page</h2>

<?php
if (isset($_SESSION['username'])) {
    echo "Welcome, " . $_SESSION['username'] . "!";
} else {
    echo "No session found. Please login first.";
}
?>

</body>
</html>
