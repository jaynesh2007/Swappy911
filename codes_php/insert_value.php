<?php

$servername="localhost";
$username="root";
$password="";
$dbname="testDB";

$conn=mysqli_connect($servername,$username,$password,$dbname);

if(!$conn)
	{
		die("Connection failed".mysqli_connect_error());
	}
echo"Connected successfully";

$sql="INSERT INTO emp(emp_id, emp_name , emp_address , emp_salary , join_date) VALUES (101,'Jaynesh','Ahmedabad',200000,'2005-01-19');";

if(mysqli_query($conn,$sql))
	{
		echo"The is inserted successfully";
	}
else
	{
		echo"Error".$sql."<br>".mysqli_error($conn);
	}
mysqli_close($conn);
?>
