<?php
// Associative array of student marks
$marks = array
	(
    "Jaynesh" => 85,
    "Amit" => 90,
    "Ravi" => 78,
    "Neha" => 92
	);

// Using foreach to display data
foreach ($marks as $name => $score) 
{
    echo "Student Name: $name - Marks: $score <br>";
}
?>