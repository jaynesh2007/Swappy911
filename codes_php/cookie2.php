<?php
// Check if cookies are set
if (isset($_COOKIE['username']) && isset($_COOKIE['age'])) 
{
    echo "Username: " . $_COOKIE['username'] . "<br>";
    echo "Age: " . $_COOKIE['age'] . "<br>";
} 
else 
{
    echo "We can't get it. Cookies are not set.";
}
?>
